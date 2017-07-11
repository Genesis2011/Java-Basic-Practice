package task.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import task.entity.RoomType;

public class RoomTypeDao extends BaseDao{
	public List<RoomType> query(){
		String sql="SELECT * FROM `RoomType`";
		List<RoomType> list=new ArrayList();
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=openConnection();
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while (rs.next()) {
				RoomType rt=new RoomType(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4),rs.getInt(5));
				list.add(rt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(con,st,rs);
		}
		return list;
	}
	public static void main(String[] args) {
		RoomTypeDao rtd=new RoomTypeDao();
		List<RoomType> list=rtd.query();
		for(RoomType rt : list){
			System.out.println(rt.getTypeId()+rt.getName()+rt.getMoney()+rt.getBedNum()+rt.getcNum());
		}
	}
}
