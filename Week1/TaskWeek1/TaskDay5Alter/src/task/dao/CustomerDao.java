package task.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import task.entity.Customer;

public class CustomerDao extends BaseDao{
	public int checkAdd(Customer customer){
		String sql="INSERT INTO `mydb`.`Customer` (`id`, `name`, `CID`, `phone`, `beginTime`, `RoomID`) VALUES (NULL, '"
					+customer.getName()+"', '"
					+customer.getCID()+"', '"
					+customer.getPhone()+"', sysdate(), '"
					+customer.getRoomId()+"')";
		return updateCommon(sql);
	}
	public int checkDel(Customer customer){
		String sql="DELETE FROM `mydb`.`Customer` WHERE `customer`.`id` = '"
					+customer.getId()+"'";
		return updateCommon(sql);
	}
	public int checkUpdate(Customer customer){
		String sql="UPDATE `mydb`.`Customer` SET `name`='"
				+customer.getName()+"', `CID`='"
				+customer.getCID()+"', `phone`='"
				+customer.getPhone()+"', `beginTime`=sysdate(), `RoomID`='"
				+customer.getRoomId()+"' WHERE `customer`.`id` = '"
				+customer.getId()+"'";
		return updateCommon(sql);
	}
	public List<Customer> queryAll(){
		String sql="SELECT * FROM `customer`";
		return queryCommon(sql);
	}
	public List<Customer> queryById(Customer customer){
		String sql="SELECT * FROM `customer` WHERE `id`='"+customer.getId()+"'";
		return queryCommon(sql);
	}
	public List<Customer> queryDim(Customer customer){
		String sql="SELECT * FROM `customer` WHERE `name` like '%"+customer.getName()+"%'";
		return queryCommon(sql);
	}
	public int pageSum(int numSingle){
		String sql="SELECT * FROM `customer`";
		List<Customer> list=new ArrayList();
		list=queryCommon(sql);
		if ((list.size()%numSingle)==0) {
			return (list.size()/numSingle);
		} else {
			return (list.size()/numSingle)+1;
		}
	}
	public List<Customer> queryPaging(int pageCurrent,int numSingle){
		String sql="SELECT * FROM `customer` limit "+((pageCurrent-1)*numSingle)+","+numSingle;
		return queryCommon(sql);
	}
	public List<Customer> queryCommon(String sql){
		List<Customer> list=new ArrayList();
		Connection con=null;
		Statement st = null;
		ResultSet rs=null;
		try {
			con=openConnection();
			st=con.createStatement();
			rs=st.executeQuery(sql);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			while (rs.next()) {
				Date dt=sdf.parse(rs.getDate(5)+" "+rs.getTime(5));
				Customer customer=new Customer(
												rs.getInt(1),
												rs.getString(2),
												rs.getString(3),
												rs.getString(4),
												dt,
												rs.getInt(6)
												);
				list.add(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(con,st,rs);
		}
		return list;
	}
}
