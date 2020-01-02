package DatabasePack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class PrintBookDetails {
	public static void main(String[] args){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Author ID to view his Books:");
			int authid=Integer.parseInt(br.readLine());
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "seed1234");
		PreparedStatement pm=con.prepareStatement("select * from book, author"
				+ " where book.authorid=author.authorid"
				+ " and book.authorid=?");
		pm.setInt(1,authid);
		ResultSet rs=pm.executeQuery();
		while(rs.next()){
			System.out.println("ISBN number:"+rs.getString(1));
			System.out.println("Book Title:"+rs.getString(2));
			System.out.println("Price:"+rs.getString(3));
			System.out.println("Author ID:"+rs.getString(4));
			System.out.println("......................................");
		}
		
		
		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
