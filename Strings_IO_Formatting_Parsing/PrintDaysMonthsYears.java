package LAB6;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PrintDaysMonthsYears {
	public static void calculate(Date dateAfter,Date dateBefore){
		long difference = dateAfter.getTime() - dateBefore.getTime();
	       int daysBetween = (int)(difference / (1000*60*60*24));
	       int monthBetween=(int)daysBetween/30;
	       daysBetween=(int)daysBetween%30;
	       int yearBetween=(int)monthBetween/12;
	       monthBetween%=12;
	       System.out.println("years:"+yearBetween);
	       System.out.println("months:"+monthBetween);
	       System.out.println("days:"+daysBetween);
	       
	}

	public static void main(String[] args) {
		 SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the date (dd mm yyyy)");
		 String dateBeforeString =scan.nextLine();

		 try {
			 
			 DateFormat df = new SimpleDateFormat("dd MM yyyy");
			 Date dateobj = new Date();
			 
			   Date dateBefore = myFormat.parse(dateBeforeString);
		       Date dateAfter =dateobj;
		       calculate(dateAfter,dateBefore);
		    	  
		 } catch (Exception e) {
		       e.printStackTrace();
		 }
	}

}
