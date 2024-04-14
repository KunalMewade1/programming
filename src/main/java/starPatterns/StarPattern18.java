package starPatterns;

import java.util.Scanner;

public class StarPattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Here is your Pattern
		*************
		 *         *
		  *       *
		   *     *
		    *   *
		     * *
		      *
		      */
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for (int i=rows; i>= 1 ; i--)
        {
            for (int j = i; j < rows ; j++) {
                System.out.print(" ");
            }   
            for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || i == rows || k==(2*i-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

			scanner.close();
		}
	}


