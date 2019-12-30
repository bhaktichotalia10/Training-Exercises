
public class Validate {
	String fname="";
	String lname="";
	public Validate(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	
	public void getResult(){
		try {
			if(fname.equals("") || lname.equals("")){
				throw new MyNameException();
			}
			else{
				System.out.println("Program terminated successfully");
			}
		} catch (MyNameException e) {
			System.out.println(e);
		}
	}	
}
