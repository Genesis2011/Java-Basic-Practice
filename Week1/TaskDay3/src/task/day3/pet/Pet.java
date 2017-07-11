package task.day3.pet;

public abstract class Pet {
	private String name;
	private int age;
	
	public abstract void play();
	public abstract void showInfo();

	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
