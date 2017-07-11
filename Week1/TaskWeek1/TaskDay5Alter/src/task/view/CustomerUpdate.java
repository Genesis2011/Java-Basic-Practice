package task.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import task.bin.CustomerBin;
import task.entity.Customer;

public class CustomerUpdate {
	public boolean update() throws ParseException{
		CustomerBin cb=new CustomerBin();
		List<Customer> list=new ArrayList();
		list=cb.queryAll();
		if(list.size()>0){
			Scanner input=new Scanner(System.in);
			System.out.println("请输入id编号");
			int id=input.nextInt();
			System.out.println("输入姓名");
			String name=input.next();
			System.out.println("输入身份证号");
			String cid=input.next();
			System.out.println("输入电话");
			String phone=input.next();
			
			System.out.println("输入入住时间（格式：yyyy-mm-dd hh:mm:ss）");
			input.nextLine();//消除换行带来的影响
			String beginTime=input.nextLine();
			
			System.out.println("输入房间号");
			int roomID=input.nextInt();
			Customer customer=new Customer();
			customer.setId(id);
			customer.setName(name);
			customer.setCID(cid);
			customer.setPhone(phone);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:dd");
			Date dt=sdf.parse(beginTime);
			customer.setBeginTime(dt);
			customer.setRoomId(roomID);
			if(cb.updateCustomer(customer)){
				return true;
			}
			else{
				return false;
			}
		} else {
			System.out.println("数据库中Customer表为空");
			return false;
		}
	}
}
