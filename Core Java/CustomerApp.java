import java.util.*;
public class CustomerApp {
	public static String Loginid;
	public static String Loginpassword;
	
	Customer[] custarr = new Customer[10];
	custarr[0] = new Customer(1001,"Bhakti","bhakti10gmail.com",1234567890);
	custarr[1]=  new Customer(1002,"Harsh","harsh15gmail.com",0987654321);
	custarr[2]=	 new Customer(1003,"Prerit","prerit17gmail.com",5678901234);
	
	public static void main(String[] args){
		
		Customer cust = new Customer();	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		Loginid=sc.next();
		System.out.println("Enter the password: ");
		Loginpassword=sc.next();
		
		if(Loginid.equals("ABCCust") && Loginpassword.equals("abc@123"))
		{
			System.out.println("1. Add Customer details \n" 
					+"2. Print Customer Details \n"
					+"3. Edit Existing Details \n"
					+"4. Delete Existing Customer \n"
					+"5. Exit");
			
			int choice=sc.nextInt();
			do{
				switch(choice)
				{
				case 1:	
					AddCustomerDetails();
					break;			
					
				case 2:
					PrintCustomerDetails();
					break;
				
				case 3: 
					EditCustomerDetails();
					break;
				
				case 4: 
					DeleteCustomerDetails();
					break;
				
				case 5:
					System.out.println("GOodbye!");
					break;
				}
			}while(choice!=5);
		}
		else
		{
			System.out.println("Invalid ID or Password. Please Enter Correct ID and Password");
		}

	}

}
