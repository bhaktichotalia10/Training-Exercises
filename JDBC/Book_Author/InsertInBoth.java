package DatabasePack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class InsertInBoth {
	public static void main(String[] args){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter author id:");
			int authid=Integer.parseInt(br.readLine());
			String fname,mname,lname,phone;
			System.out.println("enter first name:");
			fname=br.readLine();
			System.out.println("enter middle name:");
			mname=br.readLine();
			System.out.println("enter last name:");
			lname=br.readLine();
			System.out.println("enter phone number:");
			phone=br.readLine();
			System.out.println("enter ISBN number:");
			int isbn=Integer.parseInt(br.readLine());
			String title;
			System.out.println("enter Book Title:");
			title=br.readLine();
			System.out.println("enter price:");
			int price=Integer.parseInt(br.readLine());
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "seed1234");
		PreparedStatement pm=con.prepareStatement("insert into author values(?,?,?,?,?)");
		pm.setInt(1,authid);
		pm.setString(2,fname);
		pm.setString(3,mname);
		pm.setString(4,lname);
		pm.setString(5,phone);
		pm.executeUpdate();
		pm.close();
		
		pm=con.prepareStatement("insert into book values(?,?,?,?)");
		pm.setInt(1,isbn);
		pm.setString(2,title);
		pm.setInt(3,price);
		pm.setInt(4,authid);
		pm.executeUpdate();
		pm.close();
		System.out.println("Data inserted");
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
