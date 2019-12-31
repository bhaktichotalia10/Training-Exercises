
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadEmpData {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","seed1234");
			System.out.println("connected....");
			
			Statement stat=con.createStatement();
			ResultSet res=stat.executeQuery("select * from employee1");
			
			System.out.println("Employee_Id   First_Name  ");
			System.out.println("------------------------------------------------------------------");
			while(res.next()){
				System.out.println(res.getInt("id")+"      "
										+res.getString("name")+"      ");
										
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
