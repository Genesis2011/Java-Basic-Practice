package task.view;

import java.util.Scanner;

import task.bin.UserBin;
import task.entity.User;

public class UserReset {
	//修改密码
	public boolean reset(User user){
		Scanner input=new Scanner(System.in);
		System.out.println("输入原密码");
		String pwd=input.next();
		System.out.println("输入新密码");
		String newPwd=input.next();
		System.out.println("再次输入新密码");
		String newPwdVerify=input.next();
		if(pwd.equals(user.getPassword())){
			if (newPwd.equals(newPwdVerify)) {
				user.setPassword(newPwd);
				UserBin ub=new UserBin();
				return ub.reset(user);
			} else {
				System.out.println("两次新密码不一致");
				return false;
			}
		}else {
			System.out.println("原密码错误");
			return false;
		}
	}
}
