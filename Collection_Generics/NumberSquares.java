package LAB7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class NumberSquares {
	public static Map square(int[] arr,int n)
	{
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			 Integer freq = (Integer) m.get(arr[i]);
			 m.put(arr[i], (int)Math.pow(arr[i], 2)); 
		}
		return m;
	}
	public static void main(String args[])
	{
		System.out.print("how many numbers you want to enter:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		Map m=square(arr,n);
		System.out.println("the nunbers and thier squares are:\n"+m);
		
	}

}
