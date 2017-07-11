package task.bin;

import java.util.List;

import task.dao.RoomDao;
import task.entity.Room;

public class RoomBin {
	public List<Room> query(){
		RoomDao rd=new RoomDao();
		return rd.query();
	}
}
