package task.game_guess;

import java.util.Scanner;

public class Player {
	public String name;
	public int score;
	public int hit(){
		System.out.println("1:石头  2:剪刀  3:布");
		System.out.print("请选择:");
		int num=new Scanner(System.in).nextInt();
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
