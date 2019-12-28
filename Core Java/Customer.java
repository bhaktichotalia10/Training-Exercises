import java.util.*;
public class Customer {
	private int id;
	private String name;
	private String email;
	private int mobileno;
	
	Scanner sc = new Scanner(System.in);
	
	public Customer(){}
	
	public Customer(int id, String name, String email, int mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileno = mobileno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	
	public void AddCustomerDetails()
	{
		System.out.println("You chose to add Custome Details");
		System.out.println("Enter Customer ID: ");
		id=sc.nextInt();
		System.out.println("Enter Customer Name: ");
		name=sc.next();
		System.out.println("Enter Customer Email: ");
		email=sc.next();
		System.out.println("Enter Customer Mobile Number: ");
		mobileno=sc.nextInt();		
	}
	

}
