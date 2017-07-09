package task.day3.school;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		/*
		 * 学校的工作
		 * 		教师 至少两个
		 * 			姓名 年龄 工龄 负责教学工作
		 * 		班主任 至少两个
		 * 			姓名 年龄 工龄 负责管理工作
		 * 		学生 至少两个
		 * 			姓名 年龄 班级 负责学习工作
		 * 输出
		 * 		列表 多个教师和多个班主任和多个学生的信息
		 * 		list列表存储
		 * 			至少六条信息
		 * 			姓名 年龄 工龄/班级
		 * 		调用其中一个教师的教学方法
		 * 		调用其中一个班主任的管理方法
		 * 		调用其中一个学生的学习方法
		 */
		
		List list=new ArrayList();
		list.add(new Teacher("王老师",27,3));
		list.add(new Teacher("张老师",35,10));
		list.add(new Mentor("邓老师",26,2));
		list.add(new Mentor("宋老师",28,4));
		list.add(new Student("李学生",21,"信科1401"));
		list.add(new Student("杜学生",22,"信科1402"));
		
		for(int i=0; i<list.size(); i++){
			if(list.get(i) instanceof Teacher){
				((Teacher)list.get(0)).showInfo();
			}
			else if(list.get(i) instanceof Mentor){
				((Mentor)list.get(i)).showInfo();
			}
			else if(list.get(i) instanceof Student){
				((Student)list.get(i)).showInfo();
			}
			
		}
		
		((Teacher)list.get(0)).funWork();
		((Mentor)list.get(2)).funWork();
		((Student)list.get(4)).funWork();;
	}

}
