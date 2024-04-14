package programming.programming;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		while((n=scanner.nextInt())!=0) {
			System.out.println("You have entered"+n);
		}
		scanner.close();

	}

}
