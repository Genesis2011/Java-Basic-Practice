package task.entity;

public class RoomType {
	private Integer typeId;
	private String name;
	private float money;
	private Integer bedNum;
	private Integer cNum;
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public Integer getBedNum() {
		return bedNum;
	}
	public void setBedNum(Integer bedNum) {
		this.bedNum = bedNum;
	}
	public Integer getcNum() {
		return cNum;
	}
	public void setcNum(Integer cNum) {
		this.cNum = cNum;
	}
	public RoomType(Integer typeId, String name, float money, Integer bedNum, Integer cNum) {
		this.typeId = typeId;
		this.name = name;
		this.money = money;
		this.bedNum = bedNum;
		this.cNum = cNum;
	}
	public RoomType() {
	}
}
