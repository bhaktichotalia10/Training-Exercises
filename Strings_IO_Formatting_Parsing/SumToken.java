package LAB6;
import java.util.*;

public class SumToken {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Integers with one space gap: ");
		String val=sc.nextLine();
		StringTokenizer st = new StringTokenizer(val);
		int sum=0,temp;
		System.out.println("The integers entered are: ");
		while(st.hasMoreTokens())
		{
			temp=Integer.parseInt(st.nextToken());
			System.out.println(temp);
			sum=sum+temp;
		}
		System.out.println("Sum: "+sum);
		sc.close();
	}

}
