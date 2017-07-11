package task.day3.pet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		/*
		 * 宠物:
		 * 		狗 至少两只
		 * 			姓名 玩飞碟 年龄 腿的数量
		 * 		企鹅	至少两只
		 * 			姓名 游泳 年龄 腿的数量
		 * 		海豚 至少两只
		 * 			姓名 游泳 年龄
		 * 输出信息列表
		 * 选择添加宠物
		 * 根据姓名查询信息
		 * 根据姓名删除宠物信息
		 * 
		 * 有菜单引导用户操作功能
		 */
		
		Map map = new HashMap();
//		map.put("Du", new Dog("Du",5));
		
		try {
			boolean flag=true;
			while(flag){
				
				System.out.println("欢迎来到宠物管理系统");
				System.out.println("\t1.宠物信息列表");
				System.out.println("\t2.添加宠物信息");
				System.out.println("\t3.根据宠物姓名查询宠物信息");
				System.out.println("\t4.根据宠物姓名删除宠物信息");
				System.out.println("\t5.退出系统");
				System.out.print("请输入你的选择：");
				
				int choice = new Scanner(System.in).nextInt();
				switch (choice) {
				case 1:
					if(map.isEmpty()){
						System.out.println("宠物信息库为空");
					}
					else{
						//循环输出宠物信息
						Iterator entries = map.entrySet().iterator();
						while (entries.hasNext()) {
							Map.Entry entry=(Map.Entry) entries.next();
							Pet value=(Pet)entry.getValue();
							value.showInfo();
						}
					}
					break;
				case 2:
					System.out.println("宠物类别：");
					System.out.println("\t1.狗🐶");
					System.out.println("\t2.企鹅🐧");
					System.out.println("\t3.海豚🐬");
					System.out.print("请输入添加的宠物类别：");
					int category=new Scanner(System.in).nextInt();
					
					System.out.print("请输入宠物姓名：");
					String name=new Scanner(System.in).next();
					System.out.print("请输入宠物年龄：");
					int age=new Scanner(System.in).nextInt();
					
					switch (category) {
					case 1:
						map.put(name, new Dog(name,age));
						break;
					case 2:
						map.put(name, new Penguin(name,age));
						break;
					case 3:
						map.put(name, new Dolphin(name,age));
						break;
					default:
						System.out.println("宠物类别数字范围：1～3");
						break;
					}
					break;
				case 3:
					System.out.print("请输入宠物姓名：");
					String nameSearch=new Scanner(System.in).next();
					if(!(map.containsKey(nameSearch))){
						System.out.println("不存在姓名为"+nameSearch+"的宠物");
					}
					else{
						Pet value=(Pet)map.get(nameSearch);
						value.showInfo();
					}
					break;
				case 4:
					System.out.print("请输入宠物姓名：");
					String nameDel=new Scanner(System.in).next();
					if(!(map.containsKey(nameDel))){
						System.out.println("不存在姓名为"+nameDel+"的宠物");
					}else{
						map.remove(nameDel);
						System.out.println("成功删除姓名为"+nameDel+"的宠物信息");
					}
					break;
				case 5:
					flag=false;
					System.out.println("成功退出宠物信息管理系统");
					break;
				default:
					System.out.println("请输入1～5之间的数字");
					break;
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("你的输入格式有误！");
			System.out.println("异常："+e);
		}
	}

}
