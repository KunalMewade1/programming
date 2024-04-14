package pattern;

import java.util.Scanner;

public class NumberPattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		
	    1111111
		1111122
		1111333
		1114444
		1155555
		1666666
		7777777
		        */
		
		
		        
		        Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(1);
			}
			for(int j=1;j<=i;j++) {
				
				System.out.print(i);
			}
			System.out.println();
		}
		scanner.close();
	}

}
