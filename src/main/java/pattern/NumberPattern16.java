package pattern;

import java.util.Scanner;

public class NumberPattern16 {

	public static void main(String[] args) {
			/*Here is your Pattern
		1 
		2 8 
		3 9 14 
		4 10 15 19 
		5 11 16 20 23 
		6 12 17 21 24 26 */
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for(int i=1;i<=rows;i++) {
			int num=i;
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num=num+rows-j;
			}
			System.out.println();
		}
			scanner.close();
	}

}
