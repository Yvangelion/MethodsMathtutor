package Lab7Test1;

public class Lab7oneClass {
	
	/* 
	 * Computer Science 1 Spring
	 * 7-1 Temperature Conversions
	 * 
	 * This program outputs the conversions of values from Celsius  to Fahrenheit and vice versa and displays 
	 * the outputs into a table.
	 */

	public static void main(String[] args) {

		System.out.println(
			"Celsius     Fahrenheit     |     Fahrenheit     Celsius\n" +
			"___________________________________________________________");

		for (double celsius = 40.0, fahrenheit = 120.0;  celsius >= 31.0; celsius--, fahrenheit -= 10) {
			
			
			System.out.printf("%-12.1f", celsius);
			System.out.printf("%-15.1f|", celsiusToFahrenheit(celsius));
			System.out.printf("     %-15.1f", fahrenheit);
			System.out.printf("%-7.2f\n\n", fahrenheitToCelsius(fahrenheit));
		}
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}