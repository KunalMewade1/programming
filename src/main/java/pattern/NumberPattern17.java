package pattern;

import java.util.Scanner;

public class NumberPattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Here is your Pattern
1 2 3 4 5 6 7 
1 2 3 4 5 6 7 1 
1 2 3 4 5 6 7 1 2 
1 2 3 4 5 6 7 1 2 3 
1 2 3 4 5 6 7 1 2 3 4 
1 2 3 4 5 6 7 1 2 3 4 5 
1 2 3 4 5 6 7 1 2 3 4 5 6 
*/
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for(int i=1;i<rows+1;i++) {
			for(int j=1;j<rows+1;j++) {
				System.out.print(j+" ");
			}
			for(int k=1;k<i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		scanner.close();

	}

}
