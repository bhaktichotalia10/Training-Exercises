package LAB6;

import java.util.Scanner;

class JobSeeker{
	private int jobid;
	private String username;
	private String email;
	private int mobileno;
	public JobSeeker(int jobid, String username, String email, int mobileno) {
		this.jobid = jobid;
		this.username = username;
		this.email = email;
		this.mobileno = mobileno;
	}
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "JobSeeker [jobid=" + jobid + ", username=" + username + ", email=" + email + ", mobileno=" + mobileno
				+ "]";
	}
	public boolean validate()
	{
		if(username.matches("[A-Za-z]{8}[a-zA-Z]*_job"))
			return true;
		else
			return false;
	}
	
}
public class JobSeekerDemo {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the job id:");
		String jobid=scan.next();
		System.out.print("enter the username:");
		String username=scan.next();
		System.out.print("enter the email:");
		String email=scan.next();
		System.out.print("enter the mobile number:");
		int mobileno=scan.nextInt();
		
		JobSeeker j=new JobSeeker(jobid, username, email, mobileno);
		
		
		if(j.validate())
		{
			System.out.println(j);
		}
		else
			System.out.println("the username is invalid. please try again");
	}
}
