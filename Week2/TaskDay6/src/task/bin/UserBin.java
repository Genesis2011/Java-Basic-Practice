package task.bin;

import java.util.List;

import task.dao.UserDao;
import task.entity.User;

public class UserBin {
	//登录
	public boolean login(User user){
		UserDao ud=new UserDao();
		return ud.checkLogin(user);
	}
	//注册
	public boolean register(User user){
		UserDao ud=new UserDao();
		if(ud.checkRegister(user)>0)
			return true;
		else
			return false;
	}
	//修改密码
	public boolean reset(User user){
		UserDao ud=new UserDao();
		if(ud.checkReset(user)>0)
			return true;
		else
			return false;
	}
	//检查用户名是否重复
	public boolean checkName(String name){
		UserDao ud=new UserDao();
		if(ud.checkName(name))
			return true;
		else
			return false;
	}
	//查询
	public List<User> query(){
		UserDao ud=new UserDao();
		return ud.query();
	}
}
