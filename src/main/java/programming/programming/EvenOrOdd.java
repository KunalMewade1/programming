package programming.programming;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		System.out.println("Input an Integer");
		Scanner input= new Scanner(System.in);
		c=input.nextInt();
		input.close();

		if((c/2)*2==c)
		{
			System.out.println("even");
		}
		else {
			System.out.println("Odd");
		}
			}
	
	

}
