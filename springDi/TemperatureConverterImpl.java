package springDi;



public class TemperatureConverterImpl implements TemperatureConverter {
	private double conversionFactor;

	public TemperatureConverterImpl(double conversionFactor) {
		super();
		this.conversionFactor = conversionFactor;
	}
	 
	public double fahrenheitToCelsius(double fahrenheit){
		System.out.println("fahrenheitToCelsius()");
		return ((fahrenheit - 32)*conversionFactor); 
	}

}
