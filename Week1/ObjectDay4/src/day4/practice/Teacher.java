package day4.practice;

public class Teacher extends Person implements IWorkYear {
	private int workYear;
	
	public Teacher(String name, int age,int workYear) {
		super(name, age);
		this.workYear=workYear;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"负责教学工作");
	}
	
	@Override
	public int getWorkYear() {
		return workYear;
	}

}
