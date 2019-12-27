import java.util.*;
public class SumOfnNaturalNumbers 
{
	int calculateSum(int n)
	{
		int count=0;
		int sum=0;
		int i=1;
		while(count<n)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
				count++;
				i++;
			}
			else
			{
				i++;
			}
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int n,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		SumOfnNaturalNumbers obj= new SumOfnNaturalNumbers();
		sum=obj.calculateSum(n);
		System.out.println("Sum of "+n+" nubers is "+sum);
		sc.close();
	}
}
