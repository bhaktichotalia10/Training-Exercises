import java.util.*;
public class Details { 
	public static void main(String[] args){	
	
	String fname;
	String lname;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first name: ");
	fname=sc.nextLine();
	System.out.println("Enter last name: ");
	lname=sc.nextLine();
	
	Validate v = new Validate(fname,lname);
	v.getResult();
	}

}
