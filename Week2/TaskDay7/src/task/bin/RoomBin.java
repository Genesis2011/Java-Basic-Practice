package task.bin;

import java.util.ArrayList;
import java.util.List;

import task.dao.RoomDao;
import task.dao.RoomTypeDao;
import task.entity.Room;
import task.entity.RoomE;
import task.entity.RoomType;

public class RoomBin {
	public List<Room> query(){
		RoomDao rd=new RoomDao();
		return rd.query();
	}
	public List<Room> search(Integer roomid){
		RoomDao rd=new RoomDao();
		return rd.search(roomid);
	}
	public List<RoomE> searchRT(Integer roomid){
		List<RoomE> list=new ArrayList<RoomE>();
		RoomDao rd=new RoomDao();
		List<Room> rlist=rd.search(roomid);
		Room relRoom1=rlist.get(0);
		RoomTypeDao rtd=new RoomTypeDao();
		List<RoomType> rtList=rtd.search(relRoom1.getType());
		RoomType relRoomType = rtList.get(0);
		list.add(new RoomE(
				relRoom1.getRoomid(),
				relRoom1.getState(),
				relRoom1.getType(),
				relRoomType
				));
		return list;
	}
	public List<RoomE> queryRT(){
		List<RoomE> list=new ArrayList<RoomE>();
		RoomDao rd=new RoomDao();
		List<Room> rlist=rd.query();
		for(int i=0; i<rlist.size(); i++){
			Room relRoom1=rlist.get(i);
			RoomTypeDao rtd=new RoomTypeDao();
			List<RoomType> rtList=rtd.search(relRoom1.getType());
			RoomType relRoomType = rtList.get(0);
			list.add(new RoomE(
					relRoom1.getRoomid(),
					relRoom1.getState(),
					relRoom1.getType(),
					relRoomType
					));
		}
		return list;
	}
}
