package temperatureConverterAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TemperatureConverterClient {
	public static void main(String args[]) throws Exception{
		ApplicationContext factory = new ClassPathXmlApplicationContext("anno.xml");
		TemperatureConverter tempc = (TemperatureConverter)factory.getBean("temperatureConverter");
		double celsius = tempc.fahrenheitToCelsius(50.0);
		System.out.println("50.0F is "+celsius+" C");
	}

}
