package task.game_guess;

public class Computer {
	public String name;
	public int score;
	public int hit(){
		int num=(int)(Math.random()*3)+1;
		switch(num){
		case 1:
			System.out.println(name+"出石头");
			break;
		case 2:
			System.out.println(name+"出剪刀");
			break;
		case 3:
			System.out.println(name+"出布");
			break;
		}
		return num;
	}
}
