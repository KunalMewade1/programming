package pattern;

import java.util.Scanner;

public class NumberPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Here is your Pattern
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
		 */
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=rows;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//printing lower half of the pattern
		for(int i=rows-1;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=rows;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();

	}

}
