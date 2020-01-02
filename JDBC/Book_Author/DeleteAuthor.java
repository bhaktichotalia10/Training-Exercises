package DatabasePack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DeleteAuthor {
	public static void main(String[] args){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter ID to Delete:");
			int authid=Integer.parseInt(br.readLine());
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "seed1234");
		PreparedStatement pm=con.prepareStatement("delete from author"
				+ " where authorid=?");
		pm.setInt(1,authid);
		pm.executeUpdate();
		System.out.println("Record deleted!!");

	}
		catch(Exception ex){
			ex.printStackTrace();
		}
}

}
