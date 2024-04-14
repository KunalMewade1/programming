package pattern;

import java.util.Scanner;

public class NumberPattern4 {
				/*
				 * Here is your Pattern
7 6 5 4 3 2 1 
7 6 5 4 3 2 
7 6 5 4 3 
7 6 5 4 
7 6 5 
7 6 
7
				 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
        scanner.close();
	}

}
