package programming.programming;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			float temperature;
			Scanner input=new Scanner(System.in);
			System.out.println("enter the temparature in ferenheit");
			
			temperature=input.nextFloat();
			input.close();
			temperature=((temperature-32)*5)/9;
			
			System.out.println("Temperatur in celsius"+temperature);
	}

}
