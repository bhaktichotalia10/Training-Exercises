import java.util.Scanner;

public class ArrayLimitation {

	public static void main(String[] args) {
		int len,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Elements do you want to add? ");
		len=sc.nextInt();
		
		int nos[]=new int[len];
		System.out.println("Add "+len+" Elements: ");
		for(int i=0;i<len;i++)
		{
			nos[i]=sc.nextInt();
		}
		for(int j=0;j<len;j++)
		{ 
			for(int k=j+1;k<len;k++)
			{ //
				if(nos[j]>nos[k])
				{
					temp=nos[j];
					nos[j]=nos[k];
					
					nos[k]=temp;
				}
			}
		}
		System.out.println("Ascendiong Order: ");
		for(int n=0;n<len;n++)
			System.out.print(nos[n]+" ");
	}
}