package starPatterns;

import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {
		/*
		Here is your Pattern
		*
		**
		***
		****
		*****
		******
		*******
		********
		*/
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for(int i=0;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print("");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scanner.close();

	}

}
