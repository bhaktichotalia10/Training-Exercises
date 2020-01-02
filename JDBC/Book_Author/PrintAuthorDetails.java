package DatabasePack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class PrintAuthorDetails {
	public static void main(String[] args){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Author ID to Retrieve:");
			int authid=Integer.parseInt(br.readLine());
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "seed1234");
		PreparedStatement pm=con.prepareStatement("select * from author where authorid=?");
		pm.setInt(1,authid);
		ResultSet rs=pm.executeQuery();
		while(rs.next()){
			System.out.println("Author ID:"+rs.getString(1));
			System.out.println("First Name:"+rs.getString(2));
			System.out.println("Middle Name:"+rs.getString(3));
			System.out.println("Last Name:"+rs.getString(4));
			System.out.println("Phone Number:"+rs.getString(5));
			System.out.println("......................................");
		}
		
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
