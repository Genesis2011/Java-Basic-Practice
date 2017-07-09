package task.day3.school;

public class Student extends SchoolPerson {
	private String stuClass;
	
	public Student(String name, int age, String stuClass) {
		super(name, age);
		this.stuClass=stuClass;
	}

	@Override
	public void funWork() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"的学习方法");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("姓名:"+this.getName()+" 年龄:"+this.getAge()+" 班级:"+this.stuClass);
	}

}
