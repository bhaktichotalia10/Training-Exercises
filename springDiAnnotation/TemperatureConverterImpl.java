package temperatureConverterAnnotation;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import temperatureConverterAnnotation.ExchangeServiceImpl;

@Component("temperatureConverter")
public class TemperatureConverterImpl implements TemperatureConverter {
	//@Autowired
		private ExchangeServiceImpl exchangeService;
		// currencyConverterImpl 
		
		public TemperatureConverterImpl() {
			System.out.println("TemperatureConverterImpl()");
		}
		
		@Autowired
		public TemperatureConverterImpl(ExchangeServiceImpl exchangeService) {
			System.out.println("TemperatureConverterImpl(es)");
			this.exchangeService = exchangeService;
		}
		
		public double fahrenheitToCelsius(double fahrenheit){
			System.out.println("fahrenheitToCelsius()");
			return ((fahrenheit - 32)*exchangeService.getExchangeRate()); 
		}
}
