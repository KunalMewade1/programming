package programming.programming;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		
		System.out.println("Before Swapping");
		
		System.out.println("Number1" +number1);
		System.out.println("Number2" +number2);
		
			//sawpping
		//num1=5
		//num2=10
		//5+10=15 15-10=5 15-5=5
		System.out.println("After Swapping");
		
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		
		System.out.println("Number1"+ number1);
		System.out.println("Number2"+ number2);
		scanner.close();
				
	
	}

}
