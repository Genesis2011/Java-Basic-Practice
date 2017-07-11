package task.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import task.bin.CustomerBin;
import task.entity.Customer;

public class CustomerQuery {
	public void queryAll(){
		CustomerBin cb=new CustomerBin();
		List<Customer> list=new ArrayList();
		list=cb.queryAll();
		queryOutput(list);
	}
	public void queryById(){
		CustomerBin cb=new CustomerBin();
		List<Customer> list=new ArrayList();
		System.out.print("输入id编号：");
		int id=new Scanner(System.in).nextInt();
		Customer customer=new Customer();
		customer.setId(id);
		list=cb.queryById(customer);
		queryOutput(list);
	}
	public void queryDim(){
		List<Customer> list=new ArrayList();
		System.out.println("输入姓名关键字：");
		String name=new Scanner(System.in).next();
		Customer customer=new Customer();
		customer.setName(name);
		CustomerBin cb=new CustomerBin();
		list=cb.queryDim(customer);
		queryOutput(list);
	}
	public void queryPaging(){
		CustomerBin cb=new CustomerBin();
		List<Customer> list=new ArrayList();
		System.out.print("每页显示记录数：");
		int numSingle=new Scanner(System.in).nextInt();
		System.out.print("共"+cb.pageSum(numSingle)+"页，请输入查看的页数：");
		int pageCurrent=new Scanner(System.in).nextInt();
		list=cb.queryPaging(pageCurrent, numSingle);
		queryOutput(list);
	}
	public void queryOutput(List<Customer> list){
		if(list.size()>0){
			for (Customer customer : list) {
				System.out.println(
									"编号："+customer.getId()
									+"\t 姓名： "+customer.getName()
									+"\t 身份证号："+customer.getCID()
									+"\t 手机号："+customer.getPhone()
									+"\t 入住时间："+customer.getBeginTime()
									+"\t 房间号："+customer.getRoomId()
									);
			}
		} else {
			System.out.println("数据库中Customer表为空");
		}
	}
}
