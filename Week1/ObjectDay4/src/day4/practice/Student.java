package day4.practice;

public class Student extends Person {
	private String classRoom;
	
	public Student(String name, int age ,String classRoom) {
		super(name, age);
		this.classRoom=classRoom;
	}

	@Override
	public void work() {
		System.out.println(getName()+"学习");
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

}
