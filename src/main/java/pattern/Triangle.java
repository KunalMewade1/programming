package pattern;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number for triangle");
		int number=scanner.nextInt();
		for(int i=1;i<=number;i++) {
			   for(int j=1;j<=i;j++) {
				System.out.print(""+i+"");
			}
			System.out.println("\n");
		}
		scanner.close();
	}

}
