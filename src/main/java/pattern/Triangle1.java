package pattern;

import java.util.Scanner;

public class Triangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner= new Scanner(System.in);
		 System.out.println("Enter the number");
		 int number=scanner.nextInt();
		 for(int i=1;i<=number;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print(i*j+" ");
			 }
			 System.out.println("\n");
			 scanner.close();
		 }
	}

}
