package task.view;

import java.util.Scanner;

import task.bin.UserBin;
import task.entity.User;

public class UserLogin {
	private User userLogin;
	//登录
	public boolean login(){
		UserBin ub=new UserBin();
		Scanner input=new Scanner(System.in);
		System.out.println("输入用户名");
		String name=input.next();
		System.out.println("输入密码");
		String pwd=input.next();
		User user=new User();
		user.setName(name);
		user.setPassword(pwd);
		setUserLogin(user);
		return ub.login(user);
	} 
	public User getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(User userLogin) {
		this.userLogin = userLogin;
	}
}
