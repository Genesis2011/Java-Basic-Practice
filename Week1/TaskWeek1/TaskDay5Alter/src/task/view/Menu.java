package task.view;

import java.text.ParseException;
import java.util.Scanner;

import task.game_russian_roulette.GameRussianRoulette;
import task.game_guess.GameGuess;

public class Menu {
	/*
	 * 登录功能 查
	 * 		输入用户名
	 * 		输入密码
	 * 		存储在实体类里
	 * 		调用业务层中的方法并给输入的用户名和密码
	 * 		业务层中调用数据访问层中的条件查询方法
	 * 			组建sql语句
	 * 			判断能否有数据返回
	 * 			返回给业务层boolean
	 * 			业务层返回给显示层boolean
	 * 注册功能 增
	 * 		输入用户相关信息
	 * 		放在实体中
	 * 			业务层调用数据访问层中添加方法
	 * 			组建添加数据的sql语句
	 * 			调用BaseDao中更新方法
	 * 			返回影响行数 int
	 * 			业务层通过影响行数int 判断出boolean 并返回给显示层
	 * 修改密码 改
	 * 		输入的是原有密码
	 * 			保存原有用户名、密码
	 * 		输入新密码 
	 * 		再次确认新密码
	 * 		调用业务层的修改方法
	 * 		调用数据访问层的修改方法
	 * 		返回影响行数
	 * 		业务层中判断影响行数int 返回boolean
	 * 		显示层判断是否修改成功
	 */
	
	/*
	 * 菜单调用游戏
	 * 
	 * 完成登录,对客户信息的管理
	 * 		添加
	 * 		删除
	 * 		修改
	 * 		查询
	 * 			按编号精确查询
	 * 			按姓名模糊查询
	 * 			分页查询 limit 每页显示的记录数量 总页数的计算
	 * 				输入页码 对应查询出结果
	 * 注意：程序三层的结构规范
	 */
	
	/*
	 * JDBC  BaseDao
	 */
	
	//主菜单
	public static void showMenu(){
		try {
			while (true) {
				System.out.println("1、登录");
				System.out.println("2、注册");
				System.out.println("3、退出");
				System.out.print("请输入你的选择：");
				int menu = new Scanner(System.in).nextInt();
				switch (menu) {
				case 1:
					showLoginMenu();
					continue;
				case 2:
					showRegisterMenu();
					continue;
				case 3:
					System.out.println("退出系统");
					break;
				default:
					System.out.println("请输入1～3之间的数字");
					continue;
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("你的输入格式有误！");
			System.out.println("异常："+e);
		}
	}
	//登录菜单
	public static void showLoginMenu() throws ParseException{
		UserLogin ul=new UserLogin();
		if(ul.login()){
			while (true) {
				System.out.println("进入管理");
				System.out.println("1、客户信息管理");
				System.out.println("2、游戏");
				System.out.println("3、修改密码");
				System.out.println("4、退出");
				int manage=new Scanner(System.in).nextInt();
				switch (manage) {
				case 1:
					showCustomerMenu();
					continue;
				case 2:
					showGameMenu();
					continue;
				case 3:
					UserReset ur=new UserReset();
					if(ur.reset(ul.getUserLogin())){
						System.out.println("成功修改密码");
					} else {
						System.out.println("修改密码失败");
					}
					continue;
				case 4:
					System.out.println("退出管理菜单");
					break;
				default:
					System.out.println("请输入1～4之间的数字");
					continue;
				}
				break;
			}
		}
		else{
			System.out.println("请重新登录");
		}
	}
	//注册菜单
	public static void showRegisterMenu(){
		UserRegister ur=new UserRegister();
		if(ur.register())
			System.out.println("注册成功");
		else
			System.out.println("注册失败");
	}
	//游戏菜单
	public static void showGameMenu(){
		while (true) {
			System.out.println("游戏");
			System.out.println("1、人机猜拳");
			System.out.println("2、俄罗斯轮盘赌");
			System.out.println("3、退出");
			System.out.print("请输入你的选择：");
			int game = new Scanner(System.in).nextInt();
			switch (game) {
			case 1:
				GameGuess gameGuess=new GameGuess();
				gameGuess.play();
				continue;
			case 2:
				GameRussianRoulette gameRussianRoulette = new GameRussianRoulette();
				gameRussianRoulette.init();
				gameRussianRoulette.play();
				continue;
			case 3:
				System.out.println("退出游戏菜单");
				break;
			default:
				System.out.println("请输入1～3之间的数字");
				continue;
			}
			break;
		}
	}
	public static void showCustomerMenu() throws ParseException{
		while (true) {
			System.out.println("客户信息管理");
			System.out.println("1、添加客户信息");
			System.out.println("2、删除客户信息");
			System.out.println("3、修改客户信息");
			System.out.println("4、查询客户信息");
			System.out.println("5、退出");
			System.out.print("请输入你的选择：");
			int customer = new Scanner(System.in).nextInt();
			switch (customer) {
			case 1:
				CustomerAdd ca=new CustomerAdd();
				if (ca.add()) {
					System.out.println("添加成功");
				} else {
					System.out.println("添加失败");
				}
				continue;
			case 2:
				CustomerDel cd=new CustomerDel();
				if(cd.del()){
					System.out.println("删除成功");
				} else {
					System.err.println("删除失败");
				}
				continue;
			case 3:
				CustomerUpdate cu=new CustomerUpdate();
				if (cu.update()) {
					System.out.println("更新成功");
				} else {
					System.out.println("更新失败");
				}
				continue;
			case 4:
				showQueryMenu();
				continue;
			case 5:
				System.out.println("退出客户信息管理菜单");
				break;
			default:
				System.out.println("请输入1～5之间的数字");
				continue;
			}
			break;
		}
	}//showCustomerMenu
	public static void showQueryMenu(){
		while (true) {
			System.out.println("客户信息查询");
			System.out.println("1、查询全部客户信息");
			System.out.println("2、按编号查询客户信息");
			System.out.println("3、模糊查询客户信息（姓名）");
			System.out.println("4、分页查询客户信息");
			System.out.println("5、退出");
			System.out.print("请输入你的选择：");
			int query = new Scanner(System.in).nextInt();
			CustomerQuery cq=new CustomerQuery();
			switch (query) {
			case 1:
				cq.queryAll();
				continue;
			case 2:
				cq.queryById();
				continue;
			case 3:
				cq.queryDim();
				continue;
			case 4:
				cq.queryPaging();
				continue;
			case 5:
				System.out.println("退出客户信息查询菜单");
				break;
			default:
				System.out.println("请输入1～5之间的数字");
				continue;
			}
			break;
		}
	}
}
