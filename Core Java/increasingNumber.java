import java.util.*;
public class increasingNumber 
{
	public boolean checkNumber(int num)
	{
		boolean result=true;
		int previous=9;
		int current;
		while(num>0)
		{
			current=num%10;
			num=num/10;
			if(current>previous)
			{
				result=false;
				break;
			}
			previous=current;
		}
		return result;
	}
	public static void main(String[] args)
	{
		int num;
		boolean result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		increasingNumber obj = new increasingNumber();
		result=obj.checkNumber(num);
		if(result)
		{
			System.out.println(num+" is an increasing number");
		}
		else
		{
			System.out.println(num+" is not an increasing number");
		}
		sc.close();
	}
}
