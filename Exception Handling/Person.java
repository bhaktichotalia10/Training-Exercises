import java.util.*;
public class Person {
	public static void main(String[] args){
		String name;
		int age; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		age = sc.nextInt();
		ValidateAge va = new ValidateAge(age);
		va.getAge();
	}

}
