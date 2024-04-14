package starPatterns;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Here is your Pattern
		* * * * * * * 
		* * * * * * 
		* * * * * 
		* * * * 
		* * * 
		* * 
		* 
		*/
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for(int i=rows-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		scanner.close();

	}

}
