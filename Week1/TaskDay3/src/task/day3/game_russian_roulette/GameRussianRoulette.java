package task.day3.game_russian_roulette;

import java.util.Scanner;

public class GameRussianRoulette {

	/*
	 * 俄罗斯轮盘赌
	 * 游戏说明:两个人玩命式的休闲游戏模式
	 * 拿共六颗子弹的左轮枪,子弹退出,放一颗子弹进枪
	 * 两个人轮流向自己开枪
	 * 直到一个人死亡为止
	 * 分析说明:
	 * 		玩家
	 * 			姓名
	 * 			开枪
	 * 				参数 枪对象
	 * 					当前枪对象的子弹空间是否有子弹
	 * 				有 返回 true
	 * 				没 返回 false 之前将枪子弹空间索引向后移动
	 * 							 如果到最后一个空间 仍然没子弹 将索引置为零
	 * 		枪
	 * 			当前空间的索引 int index
	 * 			六颗子弹的空间 boolean数组,初始情况置false
	 * 			随机填入一颗子弹
	 * 				随机生成 0~5
	 * 				将对应索引的子弹空间置为true
	 * 		游戏流程
	 * 			创建两个玩家
	 * 			创建一把枪
	 * 				随机填入子弹
	 * 			轮流开枪  注意:重复的循环内容是两个人开枪
	 * 				每开一枪有一个结果
	 * 					1、响了
	 * 						当前开枪的玩家死亡,结束游戏
	 * 					2、没响
	 * 						继续下一个人开枪
	 * 					注意:每开一枪,枪撞针移动到下一个空间
	 */
	
	public Player player1;
	public Player player2;
	
	public Revolver gun;
	
	public void init(){
		System.out.println("欢迎来到俄罗斯轮盘赌");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入玩家一姓名:");
		String name = input.next();
		player1 = new Player(name);
		
		System.out.print("请输入玩家二姓名:");
		name = input.next();
		player2 = new Player(name);
		
		System.out.println(player1.name+" VS "+player2.name);
	}
	
	public void play(){
		try {
			System.out.print("谁先开始?(1 or 2):");
			int choice = (new Scanner(System.in)).nextInt();
			System.out.println(choice);
			gun = new Revolver();
			switch (choice) {
			case 1:
				gun.run(player1, player2);
				break;
			case 2:
				gun.run(player2, player1);
				break;
			default:
				System.out.println("输入数据应是 1 或 2");
				break;
			}
		} catch (Exception e) {
			System.out.println("输入数据格式有误");
			System.out.println("异常:"+e.getMessage());
			System.out.println(e);
		}
		
	}
	
	/*public static void main(String[] args) {
		GameRussianRoulette gameRussianRoulette = new GameRussianRoulette();
		gameRussianRoulette.init();
		gameRussianRoulette.play();
	}*/

}
