import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		int len,temp;
		
		//To take input of nos.
		Scanner sc=new Scanner(System.in);
		//To know the length of array
		System.out.println("How Many Elements do you want to add?");
		len=sc.nextInt();
		
		int nos[]=new int[len];
		// take elements of array as input
		System.out.println("Add "+len+" Elements: ");
		for(int i=0;i<len;i++)
		{
			nos[i]=sc.nextInt();
		}
		Arrays.sort(nos);// API
		System.out.println("Ascendiong Order: ");
		for(int n=0;n<len;n++)
			System.out.print(nos[n]+" ");
		//nos[nos.length]=200;
		
	}

}
