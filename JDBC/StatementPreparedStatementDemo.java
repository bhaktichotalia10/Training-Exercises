import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class StatementPreparedStatementDemo {
	
	Connection con;
	Statement stat;
	int id;
	String name;
	PreparedStatement pre;
	
	public StatementPreparedStatementDemo()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","seed1234");
			System.out.println("connected....");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee Id: ");
			id=sc.nextInt();
			System.out.println("Enter Employee Name: ");
			name=sc.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void insertStatement()

	{
		try
		{
			stat=con.createStatement();
			int ra=stat.executeUpdate("insert into employee1 values("+id+",'"+name+"')");
			if(ra>0)
				System.out.println("Record Inserted...");
			else
				System.out.println("Record Not Inserted...");
				
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void insertPreStatement(){
		try
		{
			pre=con.prepareStatement("insert into employee1 values(?,?)");
			pre.setInt(1,id);
			pre.setString(2,name);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Record Inserted...");
			else
				System.out.println("Record Not Inserted...");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		StatementPreparedStatementDemo s=new StatementPreparedStatementDemo();
		//s.insertStatement();
		s.insertPreStatement();
	}

}
