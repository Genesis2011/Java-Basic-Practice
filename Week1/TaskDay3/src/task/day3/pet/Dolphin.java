package task.day3.pet;

public class Dolphin extends Pet {

	public Dolphin(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("矫健地游泳");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.print("宠物姓名:"+this.getName()+" 年龄:"+this.getAge()+" 擅长");
		play();
	}

}
