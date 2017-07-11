package task.entity;

public class Customer {
	private int id;
	private String name;
	private String CID;
	private String phone;
	private String beginTime;
	private int RoomId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public int getRoomId() {
		return RoomId;
	}
	public void setRoomId(int roomId) {
		RoomId = roomId;
	}
	
	public Customer() {
	}
	public Customer(int id, String name, String cID, String phone, String beginTime, int roomId) {
		this.id = id;
		this.name = name;
		CID = cID;
		this.phone = phone;
		this.beginTime = beginTime;
		RoomId = roomId;
	}
	
}
