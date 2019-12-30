package com.cg.eis.exception;
import java.util.*;
public class EmployeSal {

	public static void main(String[] args) {
		int salary;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter salary: ");
		salary=sc.nextInt();
		ValidateSal vsal = new ValidateSal(salary);
		vsal.getSalary();

	}

}
