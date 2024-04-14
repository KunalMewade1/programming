package starPatterns;

import java.util.Scanner;

public class StarPattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Here is your Pattern
		******* 
		 ******* 
		  ******* 
		   ******* 
		    ******* 
		     ******* 
		      ******* 
		      */
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=rows;k++) {
				System.out.print("*");	
			}
			System.out.println(" ");
		}
		scanner.close();

	}

}
