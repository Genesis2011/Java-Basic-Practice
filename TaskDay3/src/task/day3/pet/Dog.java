package task.day3.pet;

public class Dog extends Pet {
	private int legNum=4;
	
	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("玩飞碟");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.print("宠物姓名:"+this.getName()+" 年龄:"+this.getAge()+" 腿的数量:"+legNum+" 擅长");
		play();
	}

}
