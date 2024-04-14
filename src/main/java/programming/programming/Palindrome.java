package programming.programming;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the number for checking palindrome number");
		int number= scanner.nextInt();
		int n=number;
		int remainder,reverse=0;
		while(number>0)
		{
			remainder= number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		if(reverse==n) {
			System.out.println(n+ "is palindrome number");
			}
		else
		{
			System.out.println(n+"is not palindrome number");
		}
		scanner.close();
	}
	

}
