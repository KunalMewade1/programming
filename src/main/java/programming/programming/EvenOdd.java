package programming.programming;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the interger to check if it is even or odd");
		  
		Scanner scanner= new Scanner(System.in);
		
		int x=scanner.nextInt();
		scanner.close();
		if(x%2==0)
		{
			System.out.println("You have enetered the Even Interger");
		}
		else
			System.out.println("you have enetered the Odd Integer");
	} 
	

}
