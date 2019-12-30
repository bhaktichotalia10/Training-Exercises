import java.util.*;
public class EmployeeTest {
	
	public static void main(String[] args)
	{
		int id;
		String name;
		String dept;
		char choice;
		
		Employee[] emp = new Employee[10];
		emp[0] = new Employee(01,"Bhakti","IT");
		emp[1] = new Employee(02,"Harsh","SAP");
		emp[2] = new Employee(03,"Aakash","IT");
		emp[3] = null;
		emp[4] = null;
		emp[5] = null;
		emp[6] = null;
		emp[7] = null;
		emp[8] = null;
		emp[9] = null;
			
		Scanner sc = new Scanner(System.in);
		
		try {
			do {				
				System.out.println("Enter Id: ");
				id = sc.nextInt();
				System.out.println("Enter Name: ");
				name = sc.next();
				System.out.println("Enter Dept: ");
				dept = sc.next();
				
				for(int i=0;i<emp.length;i++){
					if(emp[i] == null){
						if(i >= 9){
							throw new Employee_Excep();
						}
						else{
							emp[i] = new Employee(id, name, dept);
							break;
						}
					}					
				}
				System.out.println("Do you wish to continue? (Y/N)");
				choice = sc.next().charAt(0);	
			} while (choice == 'Y' || choice =='y');
		} catch (Employee_Excep e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		sc.close();
	}
}
