package task.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import task.entity.User;

public class UserDao extends BaseDao{
	//登录状态
	public boolean checkLogin(User user){
		boolean type=false;
		String sql="select * from `user` where `name`='"
				+user.getName()+"' and `password`='"
				+user.getPassword()+"'";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		con=openConnection();
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()){
				type=true;
			}else{
				type=false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll(con,st,rs);
		}
		return type;
	}
	//注册状态
	public int checkRegister(User user){
		String sql="INSERT INTO `mydb`.`User` (`id`, `name`, `password`) VALUES (NULL, '"
					+user.getName()+"', '"
					+user.getPassword()+"')";
		return updateCommon(sql);
	}
	public int addUser(User user){
		int rel=0;
		String sql="insert into user (id,name,password) values(null,'"+user.getName()+"','"+user.getPassword()+"')";
		rel=updateCommon(sql);
		return rel;
	}
	//修改密码状态
	public int checkReset(User user){
		String sql="UPDATE `mydb`.`User` SET `password` = '"
					+user.getPassword()+"' WHERE `user`.`name` = '"
					+user.getName()+"'";
		return updateCommon(sql);
	}
	/* 
	 * 注册新用户名检查
	 * 数据库中已存在相同用户名,返回false
	 * 否则,不存在相同用户名,用户名可用,返回true
	 */
	public boolean checkName(String name){
		boolean type=true;
		String sql="select `name` from `user`";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		con=openConnection();
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				if(name.equals(rs.getString("name"))){
					type = false;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll(con,st,rs);
		}
		return type;
	}
	public List<User> query(){
		String sql="SELECT * FROM `User`";
		List<User> list=new ArrayList();
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=openConnection();
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while (rs.next()) {
				User user=new User(rs.getInt(1),rs.getString(2),rs.getString(3));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll(con,st,rs);
		}
		return list;
	}
}
