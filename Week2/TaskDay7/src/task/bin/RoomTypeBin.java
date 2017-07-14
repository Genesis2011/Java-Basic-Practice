package task.bin;

import java.util.List;

import task.dao.RoomTypeDao;
import task.entity.RoomType;

public class RoomTypeBin {
	public List<RoomType> query(){
		RoomTypeDao rtd=new RoomTypeDao();
		return rtd.query();
	}
	public List<RoomType> search(Integer typeid){
		RoomTypeDao rtd=new RoomTypeDao();
		return rtd.search(typeid);
	}
}
