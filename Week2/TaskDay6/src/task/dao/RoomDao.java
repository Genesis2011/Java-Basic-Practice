package task.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import task.entity.Room;

public class RoomDao extends BaseDao {
	public List<Room> query(){
		String sql="SELECT * FROM `Room`";
		List<Room> list=new ArrayList();
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=openConnection();
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while (rs.next()) {
				Room room=new Room(rs.getInt(1),rs.getString(2),rs.getInt(3));
				list.add(room);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(con,st,rs);
		}
		return list;
	}
}
