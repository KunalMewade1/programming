package pattern;

import java.util.Scanner;

public class NumberPattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Here is your Pattern
		1	
		2	3	
		4	5	6	
		7	8	9	10	
		11	12	13	14	15	
		16	17	18	19	20	21	
		22	23	24	25	26	27	28	*/
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		int value=1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(value+"\t");
				value++;
			}
			System.out.println();
		}
		 scanner.close();
	}

}
