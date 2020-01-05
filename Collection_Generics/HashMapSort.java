package LAB7;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class HashMapSort {
	private static final Integer ONE = new Integer(1);
	static Map<String, Integer> m=new TreeMap<String, Integer>();
	
	@SuppressWarnings("deprecation")
	public static void insert(String s)
	{
		 Integer freq = (Integer) m.get(s);
		 m.put(s, (freq==null ? ONE :
             new Integer(freq.intValue() + 1))); 
	}
	
	public static void display()
	{
		 System.out.println("Display of the TreeMap object = " + m);
	}
	public static void main(String args[])
	{
		do{
			System.out.println("1.enter into hashmap");
			System.out.println("2.displaythe hashmap");
			System.out.println("0. exit");
			System.out.println("enter your choice");
			Scanner scan=new Scanner(System.in);
			int c=scan.nextInt();
			if(c==1)
			{
			System.out.println("enter the string to store in the hashmap");
			String s=scan.next();
			insert(s);
			}
			else if (c==2)
			{
				display();
			}
			else if(c==0)
			{
				return;
				
			}
		}while (true);
	}

}
