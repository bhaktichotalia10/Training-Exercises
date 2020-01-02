package DatabasePack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdatePriceDetails {
	public static void main(String[] args){
		try{
			int authid;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter ISBN to Update Price:");
			int isbn=Integer.parseInt(br.readLine());
			System.out.println("Enter Price:");
			Double price=Double.parseDouble(br.readLine());
			String fname;
			System.out.println("Enter author's first name:");
			fname=br.readLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "seed1234");
		PreparedStatement pm=con.prepareStatement("select authorid from author"
				+ " where firstname=?");
		pm.setString(1,fname);
		ResultSet rs=pm.executeQuery();
		rs.next();
		authid=Integer.parseInt(rs.getString(1));
		
		 pm=con.prepareStatement("update book "
					+ "set price=? where authorid=?");
			pm.setDouble(1,price);
			pm.setInt(2,authid);
	
			pm.executeUpdate();
			System.out.println("Table Updated");
		
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
