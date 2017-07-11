package test.entity;

import java.util.Date;

public class Customer {
	private Integer id;
	private String name;
	private String cid;
	private String phone;
	private Date beginTime;
	private Integer roomId;
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
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
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
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public Customer() {
	}
	public Customer(Integer id, String name, String cid, String phone, Date beginTime, Integer roomId) {
		this.id = id;
		this.name = name;
		this.cid = cid;
		this.phone = phone;
		this.beginTime = beginTime;
		this.roomId = roomId;
	}
}
