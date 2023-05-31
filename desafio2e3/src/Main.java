import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double temperaturaCelsius;
		temperaturaCelsius = sc.nextDouble();
		
		double temperaturaFahrenheit = conversorTemperatura.converterParaFahrenheit(temperaturaCelsius);
		System.out.println(temperaturaCelsius + " graus Celsius equivalem a " + temperaturaFahrenheit + " graus Fahrenheit.");
		
		sc.close();
	}

}
