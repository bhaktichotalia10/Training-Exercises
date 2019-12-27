import java.util.*;
public class PowerOfTwo 
{
	public boolean checkNumber(int num)
	{
		boolean result=false;
		if(num<=0)
		{
			return result;
		}
		while(num>1)
		{
			if(num % 2 != 0)
			{
				return result;
			}
			num=num/2;
		}
		result=true;
		return result;
	}
	public static void main(String[] args)
	{
		int num;
		boolean result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		PowerOfTwo obj = new PowerOfTwo();
		result=obj.checkNumber(num);
		if(result)
		{
			System.out.println(num+" is power of two");
		}
		else
		{
			System.out.println(num+" is not power of two");
		}
		sc.close();	
	}
}
