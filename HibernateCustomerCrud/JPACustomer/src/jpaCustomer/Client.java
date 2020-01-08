package jpaCustomer;

public class Client {
	public static void main(String[] args){
		CustomerDAO dao= new CustomerDAO();
		
		Customer customer = new Customer();
		customer.setId(182);
		customer.setName("Bhakti");
		dao.addCustomer(customer);
		
		//at this breakpoint, we have added one record to table
		customer = dao.getCustomerById(182);
		System.out.print("ID:"+customer.getId());
		System.out.println(" Name:"+customer.getName());
		
		/*customer.setName("Vishwa Tendulkar");
		dao.updateCustomer(customer);
		
		//at this breakpoint, we have updated record added in first section
		customer = dao.getCustomerById(102);
		System.out.print("ID:"+customer.getId());
		System.out.println(" Name:"+customer.getName());
		
		//at this breakpoint, record is removed from table
		Customer ce=new Customer();
		ce.setId(100);
		dao.removeCustomer(ce);*/
		System.out.println("End of program...");
	}
}