package task.bin;

import java.util.List;

import task.dao.CustomerDao;
import task.entity.Customer;

public class CustomerBin {
	public boolean addCustomer(Customer customer){
		CustomerDao cd=new CustomerDao();
		if(cd.checkAdd(customer)>0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean delCustomer(Customer customer){
		CustomerDao cd=new CustomerDao();
		if(cd.checkDel(customer)>0){
			return true;
		} else {
			return false;
		}
	}
	public boolean updateCustomer(Customer customer){
		CustomerDao cd=new CustomerDao();
		if (cd.checkUpdate(customer)>0) {
			return true;
		} else {
			return false;
		}
	}
	/*public List<Customer> queryAll(){
		CustomerDao cd=new CustomerDao();
		return cd.queryAll();
	}*/
	public List<Customer> queryAll(){
		return new CustomerDao().query();
	}
	public List<Customer> search(String name){
		return new CustomerDao().search(name);
	}
	public List<Customer> search(Integer id){
		return new CustomerDao().search(id);
	}
	
	public List<Customer> queryById(Customer customer){
		CustomerDao cd=new CustomerDao();
		return cd.queryById(customer);
	}
	public List<Customer> queryDim(Customer customer){
		CustomerDao cd=new CustomerDao();
		return cd.queryDim(customer);
	}
	public int pageSum(int numSingle){
		CustomerDao cd=new CustomerDao();
		return cd.pageSum(numSingle);
	}
	public List<Customer> queryPaging(int pageCurrent,int numSingle){
		CustomerDao cd=new CustomerDao();
		return cd.queryPaging(pageCurrent, numSingle);
	}
}
