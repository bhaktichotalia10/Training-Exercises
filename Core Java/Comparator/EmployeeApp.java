import java.util.Arrays;
public class EmployeeApp 
{

	public static void main(String[] args) 
	{
		Employee [] emp = new Employee[6];
		
		emp[0]=new Employee(1001,"Bhakti","Java");
		emp[1]=new Employee(1002,"Harsh","SAP");
		emp[2]=new Employee(1003,"Nikunj","ES");
		emp[3]=new Employee(1004,"Khushi","Finance");
		emp[4]=new Employee(1005,"Jinal","IT");
		emp[5]=new Employee(1006,"Vatsal","CE");
		
		System.out.println("====================");
		System.out.println("Employee List Sorted By Name");
		Arrays.sort(emp);
		for(int i=0;i<emp.length;i++)
			System.out.println(emp[i]);	
		
		System.out.println("====================");
		System.out.println("Employee List Sorted By Employee ID: ");
		
		CompareByEmp_id r=new CompareByEmp_id();
		
		Arrays.sort(emp,r);
		
		for(int i=0;i<emp.length;i++)
			System.out.println(emp[i]);
		
		System.out.println("====================");
		System.out.println("Employee List Sorted By Department: ");
		
		CompareByDept s=new CompareByDept();
		
		Arrays.sort(emp,s);
		
		for(int i=0;i<emp.length;i++)
			System.out.println(emp[i]);
	}
}
