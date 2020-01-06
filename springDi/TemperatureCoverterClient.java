package springDi;
import org.springframework.beans.factory.*;

import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class TemperatureCoverterClient {
	public static void main(String[] args){
		Resource res = new ClassPathResource("practice.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		TemperatureConverter tempc = (TemperatureConverter)factory.getBean("temperatureConverter");
		double celsius = tempc.fahrenheitToCelsius(50.0);
		System.out.println("50.0F is "+celsius+" C");
	}

}
