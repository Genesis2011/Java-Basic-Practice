package task.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import task.bin.CustomerBin;
import task.entity.Customer;

public class CustomerAdd {
	
	public boolean add() throws ParseException{
		CustomerBin cb=new CustomerBin();
		Scanner input=new Scanner(System.in);
		System.out.println("输入姓名");
		String name=input.next();
		System.out.println("输入身份证号");
		String cid=input.next();
		System.out.println("输入电话");
		String phone=input.next();
		
		/*System.out.println("输入入住时间（格式：yyyy-mm-dd）");
		String beginTime=input.next();*/
		/*System.out.println("输入入住时间（格式：yyyy-mm-dd hh:mm:ss）");
		input.nextLine();//消除换行带来的影响
		String beginTime=input.nextLine();*/
		System.out.println("入住时间默认为当前系统时间");
		
		System.out.println("输入房间号");
		int roomID=input.nextInt();
		Customer customer=new Customer();
		customer.setName(name);
		customer.setCID(cid);
		customer.setPhone(phone);
		/*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:dd");
		Date dt=sdf.parse(beginTime);
		customer.setBeginTime(dt);*/
		customer.setRoomId(roomID);
		return cb.addCustomer(customer);
	}
}
