package LAB6;
import java.util.*;
public class StringPositiveOrNegative {
	public static boolean check(String s)
	{
		boolean flag=true;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i+1)-s.charAt(i)>0){
				flag=true;
			}
			else 
				return false;
		}
		return flag;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.next();
		boolean b=check(s);
		if(b==true)
			System.out.println("The String is Positive");
		else
			System.out.println("The String is Negative");
	sc.close();
	}

}
