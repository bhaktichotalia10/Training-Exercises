package LAB6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLineNumber {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\bhakt\\Desktop\\Deloitte\\Java Codes\\P01\\src\\LAB6\\filelinenumber.txt");
		 BufferedReader br = null;
		  int i=0;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		  
		  String s1; 
		  try {
			while ((s1 = br.readLine()) != null) 
			    System.out.println(++i+". "+s1);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

}
}
