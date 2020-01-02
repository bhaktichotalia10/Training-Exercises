package DatabasePack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBookData {
	public static void main(String[] args){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter ISBN number:");
			int isbn=Integer.parseInt(br.readLine());
			String title;
			System.out.println("enter Book Title:");
			title=br.readLine();
			System.out.println("enter price:");
			int price=Integer.parseInt(br.readLine());
			System.out.println("enter Author ID:");
			int authorid=Integer.parseInt(br.readLine());
			
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "seed1234");
		PreparedStatement pm=con.prepareStatement("insert into book values(?,?,?,?)");
		pm.setInt(1,isbn);
		pm.setString(2,title);
		pm.setInt(3,price);
		pm.setInt(4,authorid);
		
		pm.executeUpdate();
		System.out.println("Data inserted");
		
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}

}