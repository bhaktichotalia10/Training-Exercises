public class Employee implements Comparable
{
	private int emp_id;
	private String emp_name;
	private String dept;
	
	
	public Employee(int emp_id, String emp_name, String dept) 
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.dept = dept;
	}
	public int getEmp_id() 
	{
		return emp_id;
	}
	public void setEmp_id(int emp_id) 
	{
		this.emp_id = emp_id;
	}
	public String getEmp_name() 
	{
		return emp_name;
	}
	public void setEmp_name(String emp_name) 
	{
		this.emp_name = emp_name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		String name1=e.getDept();
		String name2=this.getDept();
		
		return name1.compareTo(name2);
	}
	@Override
	public String toString() {
		return "Employee [Employee ID = " + emp_id + ", Employee Name = " + emp_name + ", Depatment = "+ dept + "]\n";
	}
	
	

}
