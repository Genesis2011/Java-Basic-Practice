package task.entity;

public class Room {
	private Integer roomId;
	private String state;
	private Integer type;
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
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
	public Room(Integer roomId, String state, Integer type) {
		this.roomId = roomId;
		this.state = state;
		this.type = type;
	}
	public Room() {
	}
}
