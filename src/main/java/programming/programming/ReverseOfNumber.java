package programming.programming;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		int remainder,reverse=0;
		while(number>0) {
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
		}
		System.out.println("Reverse of number"+reverse);
       scanner.close();
	}

}
