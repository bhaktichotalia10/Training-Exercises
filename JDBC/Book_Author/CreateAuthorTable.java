package DatabasePack;

import java.sql.*;

public class CreateAuthorTable {
	public static void main(String[] args){
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "seed1234");
		PreparedStatement pm=con.prepareStatement("create table author("
				+ "authorid number(6) primary key,"
				+ "firstname varchar2(20),"
				+ "middlename varchar2(20),"
				+ "lastname varchar2(20),"
				+ "phoneno varchar2(10)"
				+ ")");
		pm.execute();
		System.out.println("Table created successfully");
		}
		catch(Exception ex){
			ex.getMessage();
		}

	}
	
}