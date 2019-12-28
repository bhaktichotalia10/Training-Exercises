import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo implements Comparable {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		
		
		al.add("R");
		al.add("U");
		al.add("Q");
		al.add("A");
		al.add("Z");
		
		System.out.println("Given List:"+al);
		
		Object arr[]=al.toArray();
		String sarr[]=new String[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			sarr[i]=String.valueOf(arr[i]);
		}
		Arrays.sort(sarr);

		al.sort(null);
		System.out.println("Sorted List: ");
		for(int i=0;i<sarr.length;i++)
		System.out.print(sarr[i]);
		
		ArrayList<Double> dlist=new ArrayList<Double>();
		
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
