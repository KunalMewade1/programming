package starPatterns;

import java.util.Scanner;

public class StarPattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Here is your Pattern
	      *
	     * *
	    *   *
	   *     *
	  *       *
	 *         *
	*           *
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
		for (int i=1; i<= rows ; i++)
        {
            for (int j = rows; j > i ; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*(i -1) ;k++) {
                System.out.print(" ");
            }   
            if( i==1) {
                System.out.println("");
            }
            else {
                System.out.println("*");
            }
        }
        for (int i=rows-1; i>= 1 ; i--)
        {
            for (int j = rows; j > i ; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*(i -1) ;k++) {
                System.out.print(" ");
            }
            if( i==1)
                System.out.println("");
            else
                System.out.println("*");
        }
        scanner.close();
		}
	}


