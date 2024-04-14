package starPatterns;

import java.util.Scanner;

public class StarPattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Here is your Pattern
		* * * * * * * 
		* * * * * * 
		* * * * * 
		* * * * 
		* * * 
		* * 
		* 
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
		* * * * * * 
		* * * * * * * 
		*/
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for(int i=rows-1;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				System.out.print("*" + " ");
			}
			System.out.println("");
			}
		for(int i=0;i<=rows-1;i++) {
			for(int j=i;j>=0;j--) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
			scanner.close();
	}

}
