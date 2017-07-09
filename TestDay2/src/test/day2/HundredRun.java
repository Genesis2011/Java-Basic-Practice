package test.day2;

import java.util.Scanner;

public class HundredRun {

	/*
	 * 百米比赛
	 * 成绩10秒以内进入决赛，分女子组和男子组
	 * 提示：字符串比较相等
	 * str1.equals(str2)产生true或false的结果
	 */
	
	public static void main(String[] args) {
		
		System.out.print("请输入性别：（male or female）");
		
		try {
			
			Scanner input = new Scanner(System.in);
			String gender=input.next();
			switch (gender) {
			case "male":
				System.out.print("请输入男子组的成绩：");
				
				double timeSemifinalMale=input.nextDouble();
				if (timeSemifinalMale<10) {
					System.out.println("该男子进入决赛");
				} else {
					System.out.println("该男子预决赛中淘汰");
				}
				
				break;
			case "female":
				System.out.print("请输入女子组的成绩：");
				
				double timeSemifinalFemale=input.nextDouble();
				if (timeSemifinalFemale<10) {
					System.out.println("该女子进入决赛");
				} else {
					System.out.println("该女子预决赛中淘汰");
				}
				
				break;
			default:
				System.out.println("输入性别有误！");
				break;
			}
			
			/*
			 *另一种写法
			System.out.println("输入成绩：");
			int score = new Scanner(System.in).nextInt();
			if (score<10) {
				System.out.println("进入决赛");
				System.out.println("输入性别");
				String sex = input.next();
				if ("男".equals(sex)) {
					System.out.println("分在男子组");
				} else if("女".equals(sex)){
					System.out.println("分在女子组");
				}
			}*/
			
		} catch (Exception e) {
			System.out.println("你的输入格式有误！");
			System.out.println("异常："+e);
		}
		
	}

}
