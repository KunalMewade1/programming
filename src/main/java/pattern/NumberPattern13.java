package pattern;

import java.util.Scanner;

public class NumberPattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Here is your Pattern
 1 2 3 4 5 6 7 
  2 3 4 5 6 7 
   3 4 5 6 7 
    4 5 6 7 
     5 6 7 
      6 7 
       7 
     6 7  
    5 6 7  
   4 5 6 7  
  3 4 5 6 7  
 2 3 4 5 6 7  
1 2 3 4 5 6 7  
		 */
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for(int i=1;i<=rows;i++) {
			//printing i spaces at the beginning of each row
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
			
		}
			for(int j=i;j<=rows;j++) {
				System.out.print(j+" ");
			
		}
			System.out.println();
              }
		for(int i=rows-1;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=rows;j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		scanner.close();
		
}
	}