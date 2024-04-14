package programming.programming;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		int fact=1;
		while(number>0)
		{
			fact=fact*number;
			number--;
		}
     System.out.println("Factorial of a given number"+ fact);
     scanner.close();
	}
    
}
