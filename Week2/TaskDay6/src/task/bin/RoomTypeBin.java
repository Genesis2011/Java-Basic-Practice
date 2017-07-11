package task.bin;

import java.util.List;

import task.dao.RoomTypeDao;
import task.entity.RoomType;

public class RoomTypeBin {
	public List<RoomType> query(){
		RoomTypeDao rtd=new RoomTypeDao();
		return rtd.query();
	}
}
