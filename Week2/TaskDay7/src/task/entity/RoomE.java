package task.entity;

public class RoomE extends Room {
	private RoomType roomType;

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public RoomE() {
	}

	public RoomE(Integer roomid, String state, Integer type, RoomType roomType) {
		super(roomid, state, type);
		this.roomType = roomType;
	}
}
