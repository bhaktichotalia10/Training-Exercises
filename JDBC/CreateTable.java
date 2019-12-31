import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CreateTable {

	public static void main(String[] args) {
		try
		{
			// Loads required driver class from jdbc.jar in JRE 
			Class.forName("oracle.jdbc.driver.OracleDriver");
						
			//Establishes connection to given URL of Database using Provided Credentials
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Database Connected....");
			
			// just creating query object in JRE 
			CallableStatement stat=con.prepareCall("create table employee1 (id number, name varchar2(50))");
			
			
			// this statement will fire your query to the database. false ==table created
			boolean result=stat.execute();
			System.out.println(result);
			if(!result)
				System.out.println("Table Created....");
			else
				System.out.println("Table Not Created....");
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

/* DQL : DATA QUERY LANGUALE (SELECT ) con.executeQuery()
 * DDL : DATA DEFINITION LANGUAGE( CREATE , DROP , ALTER)  == con.prepareCall()
 * DCL : DATA CONTROL LANGUAGE (GRANT )
 * DML : DATA MANIPULATION LANGUAGE (INSERT , UPDATE , DELETE ) con.prepareStatement/createStatement
 * 
 * */
