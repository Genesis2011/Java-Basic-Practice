package day4.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerInfo {
	List<Person> list = new ArrayList();
	//初始化列表信息
	public void init(){
		list = new ArrayList();
		list.add(new Teacher("张", 33, 3));
		list.add(new Teacher("王", 30, 2));
		list.add(new Master("李", 26, 2));
		list.add(new Master("赵", 23, 2));
		list.add(new Student("冯", 20, "三班"));
		list.add(new Student("楚", 20, "四班"));
	}
	// 添加信息
	public boolean add() {
		list.add(getObject());
		return true;
	}

	// 查询信息
	public void query() {
		for (Person p : list) {
			System.out.println(p.getName() + "  " + p.getAge() + " " + toolsChangeClass(p));
		}
	}

	// 根据姓名查询信息
/*	public void seach(String name) {
		for (Person p : list) {
			if (p.getName().equals(name)) {
				System.out.println(p.getName() + "  " + p.getAge() + " " + toolsChangeClass(p));
				return ;
			}
		}
		System.out.println("没有找到此人信息");
	}*/
	//姓名的模糊查询
	public void seach(String name) {
		for (Person p : list) {
			//indexOf 在字符串中找到指定字符的位置 如果没找到是－1
			if (p.getName().indexOf(name)!=-1) {
				System.out.println(p.getName() + "  " + p.getAge() + " " + toolsChangeClass(p));
				 
			}
		}
		System.out.println("没有找到此人信息");
	}
	//根据姓名删除
	public void del(String name){
		for(Person p : list) {
			if(p.getName().equals(name)){
				list.remove(p);
				System.out.println("删除成功");
				return ;
			}
		}
		System.out.println("没有找到此人信息");
	}
	//根据姓名修改
	public void updateData(){
		Person upPerson=getObject();
		for (int i=0;i<list.size();i++) {
			Person p=list.get(i);
			if(p.getName().equals(upPerson.getName())){
				list.set(i, upPerson);
				System.out.println("修改完成");
				return;
			}
		}
		System.out.println("没有找到此人信息");
	} 
	
	private String toolsChangeClass(Person p) {
		String threeValue = "";
		if (p instanceof IWorkYear) {
			threeValue = ((IWorkYear) p).getWorkYear() + "";
		}
		if (p instanceof Student) {
			threeValue = ((Student) p).getClassRoom() + "";
		}
		return threeValue;
	}
	private Person getObject(){
		Person p = null;
		Scanner input = new Scanner(System.in);
		System.out.println("1、教师；2、班主任；3、学生");
		int menu = input.nextInt();
		System.out.println("输入姓名");
		String name = input.next();
		System.out.println("输入年龄");
		int age = input.nextInt();
		switch (menu) {
		case 1:
			System.out.println("输入工龄");
			int workYear = input.nextInt();
			p = new Teacher(name, age, workYear);
			break;
		case 2:
			System.out.println("输入工龄");
			workYear = input.nextInt();
			p = new Master(name, age, workYear);
			break;
		case 3:
			System.out.println("输入班级");
			String classRoom = input.next();
			p = new Student(name, age, classRoom);
			break;
		default:
			System.out.println("输入错误");
			break;
		}
		return p;
	}
}
