
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollResultSet 
{
	
	    public static void main(String[] args) throws Exception {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con = DriverManager.getConnection(
	        		"jdbc:oracle:thin:@localhost:1521:orcl", "system","seed1234");
	        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
	                ResultSet.CONCUR_READ_ONLY);
	        
	        ResultSet rs = st.executeQuery("select * from employee1");
	        System.out.println("RECORDS IN THE TABLE...");
	        
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
	        }
	        
	        rs.first();
	        System.out.println("FIRST RECORD...");
	        System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
	        
	        rs.absolute(3);
	        System.out.println("THIRD RECORD...");
	        System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
	       
	        rs.last();
	        System.out.println("LAST RECORD...");
	        System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
	        
	        rs.previous();
	        rs.relative(-1);
	        System.out.println("LAST TO FIRST...");
	        do {
				System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
			} while (rs.previous());
			con.close();
	    }

	}
