package com.cg.eis.exception;
public class ValidateSal {
	int salary;

	public ValidateSal(int salary) {
		super();
		this.salary = salary;
	} 
	public void getSalary(){
		try {
			if(salary<3000){
				throw new EmployeeException();
			}
			else{
				System.out.println("Program terminated succssfully");
			}
		} catch (EmployeeException e) {
			System.out.println(e);
		}
}
}