package java_logical_programs;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		float temperature;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit");
		temperature=scr.nextInt();
		
		temperature=((temperature-32)*5)/9;
		
		System.out.println("Temperature in Celsius= "+temperature);
	}

}
