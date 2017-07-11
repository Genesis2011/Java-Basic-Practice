package test.dao;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import test.entity.Customer;

public class CustomerDao extends BaseDao {
	public int add(Customer customer){
		/*初始返回值 设定rel变量
		组建添加的sql语句
		调用base里的update
		将影响行数返回*/
		int rel=0;
		/*String sql="INSERT INTO `mydb`.`Customer` (`id`, `name`, `CID`, `phone`, `beginTime`, `RoomID`) VALUES (NULL, '"
				+customer.getName()+"', '"
				+customer.getCid()+"', '"
				+customer.getPhone()+"', '"
				+customer.getBeginTime()+"', '"
				+customer.getRoomId()+"')";*/
		String sql="INSERT INTO `mydb`.`Customer` (`id`, `name`, `CID`, `phone`, `beginTime`, `RoomID`) VALUES (NULL, '"
				+customer.getName()+"', '"
				+customer.getCid()+"', '"
				+customer.getPhone()+"', 'sysdate()', '"
				+customer.getRoomId()+"')";
		rel=updateCommon(sql);
		return rel;
	}
	//根据姓名模糊查询
	public List<Customer> search(String name){
		List<Customer> list=new ArrayList<Customer>();
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			/*
			 * 创建连接
			 * 创建执行对象
			 * 执行sql语句返回rs
			 * 处理结果形成对象添加到列表中
			 */
			con=openConnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from customer where name like '"+"%"+name+"%'");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			while (rs.next()) {
				Date dt=sdf.parse(rs.getDate(5)+" "+rs.getTime(5));
				list.add(new Customer(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						dt,
						rs.getInt(6)
						));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			closeAll(con,st,rs);
		}
		return list;
	}
	
	//根据编号查询
	public List<Customer> search(int id){
		List<Customer> list=new ArrayList<Customer>();
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=openConnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from customer where id="+id);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			while (rs.next()) {
				Date dt=sdf.parse(rs.getDate(5)+" "+rs.getTime(5));
				list.add(new Customer(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						dt,
						rs.getInt(6)
						));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			closeAll(con,st,rs);
		}
		return list;
	}
	public List<Customer> query(){
		List<Customer> list=new ArrayList<Customer>();
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=openConnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from customer");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			
			while (rs.next()) {
				Date dt=sdf.parse(rs.getDate(5)+" "+rs.getTime(5));
//				System.out.println(dt);
//				System.out.println(rs.getDate(5)+" "+rs.getTime(5));
				list.add(new Customer(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						dt,
						rs.getInt(6)
						));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			closeAll(con,st,rs);
		}
		return list;
	}
	public static void main(String[] args) {
		CustomerDao cd = new CustomerDao();
		/*Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
		try {
			date=sdf.parse("2017-4-5 23:21:20");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);*/
//		List<Customer> list=cd.query();
		List<Customer> list=cd.search("毛");
		// SimpleDateFormat parse通过字符串转换成Date format通过Date转换成String
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		for (Customer c : list) {
			System.out.println(c.getName()+" "+sdf.format(c.getBeginTime()));
		}
	}
}
