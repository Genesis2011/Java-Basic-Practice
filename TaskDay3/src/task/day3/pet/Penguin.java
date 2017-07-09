package task.day3.pet;

public class Penguin extends Pet {
	private int legNum=2;
	
	public Penguin(String name, int age) {
		super(name, age);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("笨拙地游泳");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.print("宠物姓名:"+this.getName()+" 年龄:"+this.getAge()+" 腿的数量:"+legNum+" 擅长");
		play();
	}

}
