package pattern;

import java.util.Scanner;

public class NumberPattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Here is your Pattern
1 
1 2 1 
1 2 3 2 1 
1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
1 2 3 4 5 6 5 4 3 2 1 
1 2 3 4 5 6 7 6 5 4 3 2 1 
		 */
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		  
			scanner.close();
	}

}
