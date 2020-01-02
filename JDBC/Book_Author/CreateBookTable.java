package DatabasePack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateBookTable {

	public static void main(String[] args){
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "seed1234");
		PreparedStatement pm=con.prepareStatement("create table book("
				+ "isbn number(6) primary key,"
				+ "title varchar2(30),"
				+ "price number(5,2),"
				+ "authorid number(6),"
				+ "foreign key(authorid) references author(authorid)"
				+ ")");
		pm.execute();
		System.out.println("Table created successfully");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}
}