package pattern;

import java.util.Scanner;

public class NumberPattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
1
10
101
1010
10101
101010
1010101

		 */
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
				
			}
			System.out.println();
		}
		scanner.close();

	}

}
