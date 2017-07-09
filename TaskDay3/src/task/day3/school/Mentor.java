package task.day3.school;

public class Mentor extends SchoolPerson {
	private int workage;
	
	public Mentor(String name, int age, int workage) {
		super(name, age);
		this.workage=workage;
	}

	@Override
	public void funWork() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"的管理方法");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("姓名:"+this.getName()+" 年龄:"+this.getAge()+" 工龄:"+this.workage);
	}

}
