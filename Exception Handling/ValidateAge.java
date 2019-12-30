
public class ValidateAge {
	int age;
	public ValidateAge(int age) {
		super();
		this.age = age;
	}
	
	public void getAge(){
		try {
			if(age<15){
				throw new MyAgeException();
			}
			else{
				System.out.println("Program terminated succssfully");
			}
		} catch (MyAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
			
	}
	
	

	

}
