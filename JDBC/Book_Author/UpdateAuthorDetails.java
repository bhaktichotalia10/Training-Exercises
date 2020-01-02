package DatabasePack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateAuthorDetails {
	public static void main(String[] args){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter ID to Update:");
			int authid=Integer.parseInt(br.readLine());
			String fname,mname,lname,phone;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "seed1234");
		PreparedStatement pm=con.prepareStatement("select authorid from author"
				+ " where authorid=?");
		pm.setInt(1,authid);
		ResultSet rs=pm.executeQuery();
		rs.next();
		
			System.out.println("Enter First Name:");
			fname=br.readLine();
			System.out.println("Enter Middle Name:");
			mname=br.readLine();
			System.out.println("Enter Last Name:");
			lname=br.readLine();
			System.out.println("Enter Phone Number:");
			phone=br.readLine();
			pm.close();
			pm=con.prepareStatement("update author set"
					+ " firstname=?,"
					+ "middlename=?,"
					+ "lastname=?,"
					+ "phoneno=? where authorid=?");
			pm.setInt(5,authid);
			pm.setString(1,fname);
			pm.setString(2,mname);
			pm.setString(3,lname);
			pm.setString(4,phone);
			pm.executeUpdate();
			System.out.println("Table Updated successfully");
		
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}

}