package day4.practice;

public class Master extends Person implements IWorkYear {
	private int workAge;
	public Master(String name, int age,int workAge) {
		super(name, age); 
		this.workAge=workAge;
	}

	@Override
	public void work() {
		 System.out.println(getName()+"负责管理班级");
	}

	@Override
	public int getWorkYear() { 
		return this.workAge;
	}

}
