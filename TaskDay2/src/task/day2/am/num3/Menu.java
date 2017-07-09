package task.day2.am.num3;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		/*
		 * 第一级菜单：
		 * 		1、登录
		 * 		2、休闲游戏
		 * 		3、退出
		 * 		选择菜单编号，进入二级菜单
		 * 		选择1：
		 * 			1、用户信息管理
		 * 			2、学生信息管理
		 * 			3、教师信息管理
		 * 			4、退出
		 * 			选择菜单编号，选择谁就输出对应的菜单名称
		 * 		选择2:
		 * 			1、人机猜拳
		 * 			2、俄罗斯轮盘赌
		 * 			3、退出
		 * 			选择菜单编号，选择谁就输出对应的菜单名称
		 * 		选择3:
		 * 			退出系统
		 * 循环切换的菜单,可以进入二级菜单,选择"退出"二级菜单,退出到上一级菜单
		 */

		// 键盘输入数据可能引起异常
		try {
			boolean flag=true;
			while(flag){
				System.out.println("第一级菜单：");
				System.out.println("	1、登录");
				System.out.println("	2、休闲游戏");
				System.out.println("	3、退出");
				System.out.print("请输入你的选择：");
				
				Scanner input = new Scanner(System.in);
				int choice1 = input.nextInt();
				switch (choice1) {
				case 1:
					boolean flag1=true;
					while(flag1) {
						System.out.println("第二级菜单：");
						System.out.println("	1、用户信息管理");
						System.out.println("	2、学生信息管理");
						System.out.println("	3、教师信息管理");
						System.out.println("	4、退出");
						System.out.print("请输入你的选择：");
						
						int choice2 = input.nextInt();
						switch (choice2) {
						case 1:
							System.out.println("用户信息管理");
							continue;
						case 2:
							System.out.println("学生信息管理");
							continue;
						case 3:
							System.out.println("教师信息管理");
							continue;
						case 4:
							System.out.println("你已成功退出二级菜单");
							flag1=false;
							break;
						default:
							System.out.println("请输入1～4之间的数字");
							continue;
						}
					}
					
					continue;
				case 2:
					boolean flag2=true;
					while (flag2) {
						System.out.println("第二级菜单：");
						System.out.println("	1、人机猜拳");
						System.out.println("	2、俄罗斯轮盘赌");
						System.out.println("	3、退出");
						System.out.print("请输入你的选择：");
						
						int choice3 = input.nextInt();
						switch (choice3) {
						case 1:
							System.out.println("人机猜拳");
							continue;
						case 2:
							System.out.println("俄罗斯轮盘赌");
							continue;
						case 3:
							System.out.println("你已成功退出二级菜单");
							flag2=false;
							break;
						default:
							System.out.println("请输入1～3之间的数字");
							continue;
						}
					}
					
					continue;
				case 3:
					System.out.println("你已成功退出一级菜单");
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
