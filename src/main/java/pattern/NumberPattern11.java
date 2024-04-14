package pattern;

import java.util.Scanner;

public class NumberPattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
6 5 4 3 2 1 
7 6 5 4 3 2 1 

		 */
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		
		 for(int i=1;i<=rows;i++) {
			 for(int j=i;j>=1;j--) {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 scanner.close();
	}

}
