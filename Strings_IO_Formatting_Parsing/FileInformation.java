package LAB6;
import java.io.File;
public class FileInformation {
	public static void main(String args[])
	{
		File f=new File("C:\\Users\\bhakt\\Desktop\\Deloitte\\Java Codes\\P01\\src\\LAB6\\filelinenumber.txt");
		boolean b1=f.exists();
		boolean b2=f.canRead();
		boolean b3=f.canWrite();
		long b4=f.length();
		
		if(b1==true)
			System.out.println("The file exists");
		else 
			System.out.println("The file doesnt exists");

		
		
		if(b2==true)
			System.out.println("The file is readable ");
		else 
			System.out.println("The file is not readable");

		
		
		if(b3==true)
			System.out.println("The file is writable ");
		else 
			System.out.println("The file is not writable");
		
		
		System.out.println("the length of the file is "+f.length());
	}

}
