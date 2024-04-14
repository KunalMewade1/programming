package programming.programming;

import java.util.Scanner;

public class SumAndProductOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a positive number");
		int number= scanner.nextInt();
		if(number<0) {
			System.out.println("please enter the positive number");
		    
		}
		//calculate the sum and product of digit
		int sum=0;
		int product=1;
		while(number>0)
		{
			int digit=number%10;
			sum=sum+digit;
			product=product*digit;
			number=number/10;
		}
		//
		System.out.println("Sum of digit"+sum);
		System.out.println("product of digit"+product);
		scanner.close();
	}

}
