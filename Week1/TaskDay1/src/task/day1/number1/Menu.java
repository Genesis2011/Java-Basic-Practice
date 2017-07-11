package task.day1.number1;

import java.util.Scanner;

public class Menu {
	
	/*
	 * 食堂的优惠菜谱
	 * 		周一、周二		鱼香肉丝
	 * 		周三、周四		宫保鸡丁
	 * 		周五、周六		水煮鱼
	 * 		周日			啤酒免费
	 * 输入星期数	输出特价菜
	 */
	
	public static void main(String[] args) {
		System.out.print("请输入星期数：（周一、周二、周三、周四、周五、周六、周日）");
		Scanner input = new Scanner(System.in);
		String weekNum = input.next();
		
		switch (weekNum) {
		case "周一":
		case "周二":
			System.out.println("今日特价菜：鱼香肉丝");
			break;
		case "周三":
		case "周四":
			System.out.println("今日特价菜：宫保鸡丁");
			break;
		case "周五":
		case "周六":
			System.out.println("今日特价菜：水煮鱼");
			break;
		case "周日":
			System.out.println("今日啤酒免费");
			break;
		default:
			System.out.println("你输入的星期数有误！");
			break;
		}
	}

}
