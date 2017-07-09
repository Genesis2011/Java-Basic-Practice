package task.day3.menu;

import java.util.Scanner;

import task.day3.game_guess.GameGuess;
import task.day3.game_russian_roulette.GameRussianRoulette;

public class TestClass {

	public static void main(String[] args) {
		/*
		 * 将人机猜拳游戏、俄罗斯轮盘赌两个游戏,由菜单调用
		 * 人机猜拳游戏在 task.day3.game_guess 包中
		 * 俄罗斯轮盘赌游戏在 task.day3.game_russian_roulette 包中
		 */
		try {
			boolean flag=true;
			while(flag){
				System.out.println("游戏菜单：");
				System.out.println("	1、人机猜拳");
				System.out.println("	2、俄罗斯轮盘赌");
				System.out.println("	3、退出");
				System.out.print("请输入你的选择：");
				
				int choice = new Scanner(System.in).nextInt();
				switch (choice) {
				case 1:
					GameGuess gameGuess=new GameGuess();
					gameGuess.play();
					continue;
				case 2:
					GameRussianRoulette gameRussianRoulette = new GameRussianRoulette();
					gameRussianRoulette.init();
					gameRussianRoulette.play();
					continue;
				case 3:
					System.out.println("你已成功退出游戏菜单");
					flag=false;
					break;
				default:
					System.out.println("请输入1～3之间的数字");
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println("你的输入格式有误！");
			System.out.println("异常："+e);
		}
	}

}
