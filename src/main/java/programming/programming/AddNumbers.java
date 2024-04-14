package programming.programming;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please number the two numbers");
		System.out.println("enter first number");
		int x=scanner.nextInt();
		System.out.println("enter second number");
		int y=scanner.nextInt();
		int z=x+y;
		System.out.println("Sum of entered integers="+z);
		scanner.close();

	}

}
