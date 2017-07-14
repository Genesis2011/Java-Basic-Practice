package task.entity;

public class Room {
	private Integer roomid;
	private String state;
	private Integer type;
	public Integer getRoomid() {
		return roomid;
	}
	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Room(Integer roomid, String state, Integer type) {
		this.roomid = roomid;
		this.state = state;
		this.type = type;
	}
	public Room() {
	}
}
