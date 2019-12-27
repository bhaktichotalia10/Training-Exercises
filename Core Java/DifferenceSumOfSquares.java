import java.util.*;
public class DifferenceSumOfSquares 
{
	int calculateDifference(int n)
	{
		int squareofSum=0;
		int sumofSquares=0;
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sumofSquares=sumofSquares+(i*i);
		}
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		squareofSum=sum*sum;
		int difference = sumofSquares - squareofSum;
		return difference;
	}
	public static void main(String[] args)
	{
		int n,difference;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		DifferenceSumOfSquares obj = new DifferenceSumOfSquares();
		difference=obj.calculateDifference(n);
		System.out.println("Difference is: "+difference);
		sc.close();
	}
}
