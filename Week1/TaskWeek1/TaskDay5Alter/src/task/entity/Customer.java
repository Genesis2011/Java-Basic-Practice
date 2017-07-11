package task.entity;

import java.util.Date;

public class Customer {
	private Integer id;
	private String name;
	private String CID;
	private String phone;
	private Date beginTime;
	private Integer RoomId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Integer getRoomId() {
		return RoomId;
	}
	public void setRoomId(Integer roomId) {
		RoomId = roomId;
	}
	
	public Customer() {
	}
	public Customer(Integer id, String name, String cID, String phone, Date beginTime, Integer roomId) {
		this.id = id;
		this.name = name;
		this.CID = cID;
		this.phone = phone;
		this.beginTime = beginTime;
		this.RoomId = roomId;
	}
	
}
