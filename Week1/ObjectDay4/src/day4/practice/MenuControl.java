package day4.practice;

import java.util.Scanner;

public class MenuControl {
	public void getMenu(){
		ManagerInfo mi = new ManagerInfo();
		while (true) {
			System.out.println("1、初始化信息；");
			System.out.println("2、查询信息；");
			System.out.println("3、添加信息；");
			System.out.println("4、修改信息；");
			System.out.println("5、删除信息；");
			System.out.println("6、退出；");
			Scanner input = new Scanner(System.in);
			int menu = input.nextInt();
			switch (menu) {
			case 1:
				System.out.println("初始化操作");
				mi.init();
				continue;
			case 2:
				System.out.println("查询操作");
				System.out.println("1、查询所有；2、按照姓名查询");
				menu = input.nextInt();
				switch (menu) {
				case 1:
					mi.query();
					break;
				case 2:
					System.out.println("姓名");
					String name = input.next();
					mi.seach(name);
					break;
				}

				continue;
			case 3:
				System.out.println("添加操作");
				mi.add();
				continue;
			case 4:
				System.out.println("修改操作");
				mi.updateData();
				continue;
			case 5:
				System.out.println("删除操作");
				System.out.println("要删除的姓名：");
				mi.del(input.next());
				continue;
			case 6:
				System.out.println("退出系统");
				break;
			}
			break;
		}
	}
}
