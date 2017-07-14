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
	public List<RoomType> search(Integer typeid){
		List<RoomType> list=new ArrayList<RoomType>();
		String sql="select * from roomType where typeid="+typeid;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=openConnection();
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while (rs.next()) {
				list.add(new RoomType(
						rs.getInt(1),
						rs.getString(2),
						rs.getFloat(3),
						rs.getInt(4),
						rs.getInt(5)
						));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(con,st,rs);
		}
		return list;
	}
}
