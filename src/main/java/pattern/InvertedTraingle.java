package pattern;

import java.util.Scanner;

public class InvertedTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number for making inverted Triangle");
		int number=scanner.nextInt();
		
		while(number>0) {
			for(int i=1;i<=number;i++) {
				System.out.print(""+number+"");
			}
			System.out.println("\n");
			number--;
		}
          scanner.close();
	}

}
