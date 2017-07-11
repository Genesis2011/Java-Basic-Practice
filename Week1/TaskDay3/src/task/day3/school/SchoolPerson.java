package task.day3.school;

public abstract class SchoolPerson {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public abstract void funWork();
	public abstract void showInfo();
	
	public SchoolPerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
