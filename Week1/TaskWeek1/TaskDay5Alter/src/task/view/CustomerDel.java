package task.view;

import java.util.Scanner;

import task.bin.CustomerBin;
import task.entity.Customer;

public class CustomerDel {
	public boolean del(){
		CustomerBin cb=new CustomerBin();
		System.out.print("输入要删除的客户信息编号：");
		int id=new Scanner(System.in).nextInt();
		Customer customer=new Customer();
		customer.setId(id);
		return cb.delCustomer(customer);
	}
}
