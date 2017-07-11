package task.view;

import java.util.Scanner;

import task.bin.UserBin;
import task.entity.User;

public class UserRegister {
	//注册
	public boolean register(){
		UserBin ub=new UserBin();
		Scanner input=new Scanner(System.in);
		System.out.println("输入用户名");
		String name=input.next();
		System.out.println("输入密码");
		String pwd=input.next();
		//检查用户名是否重复
		if (ub.checkName(name)) {
			User user=new User();
			user.setName(name);
			user.setPassword(pwd);
			return ub.register(user);
		} else {
			System.out.println("用户名已存在");
			return false;
		}
	}
}
