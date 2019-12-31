import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AddEmployee{

	Connection con;
	PreparedStatement pre;
	Statement stat;
	ResultSet res;
	int id;
	String name;
	
	
	public AddEmployee()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Database Connected....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void insert()


	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee Id:");
			id=sc.nextInt();
			System.out.println("Enter Employee Name: ");
			name=sc.next();
			
			pre=con.prepareStatement("insert into employee1 values(?,?)");
			pre.setInt(1, id);
			pre.setString(2,name);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Employee Details Committed..");
			else
				System.out.println("Employee Details are Not Committed..");
			pre.close();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void printEmployeeDetails()

	{
		try
		{
			stat=con.createStatement();
			res=stat.executeQuery("select * from employee1");
			while(res.next())
			{
				System.out.println("Id : "+res.getInt("id"));
				System.out.println("Name : "+res.getString("name"));
				System.out.println("");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateEmployeeDetails()


	{
		try
		{
			pre=con.prepareStatement("update employee1 set name=? where id=?");
			pre.setString(1, "Pari");
			pre.setInt(2,1001);
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Name updated for id 1001");
			else
				System.out.println("Name is not updated..");
			pre.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteEmployeeDetails()

	{
		try
		{
			pre=con.prepareStatement("delete from employee1 where id=?");
			pre.setInt(1,1004);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Record Deleted...");
			else
				System.out.println("Record has not Deleted...");
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		AddEmployee uttam=new AddEmployee();
		uttam.insert();
		uttam.printEmployeeDetails();
		System.out.println("=======================================================");
		uttam.updateEmployeeDetails();
		uttam.printEmployeeDetails();
		uttam.deleteEmployeeDetails();
		uttam.printEmployeeDetails();
	}

}
