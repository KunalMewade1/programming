package pattern;

import java.util.Scanner;

public class NumberPattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Here is your Pattern
		1 
		2 13 
		3 12 14 
		4 11 15 22 
		5 10 16 21 23 
		6 9 17 20 24 27 
		7 8 18 19 25 26 28 
          */
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		 for(int i=1 ; i <= rows ; i++)  
	        {
	            System.out.print(i + " ");
	            int n = i;
	            for(int j = 1; j < i ; j++)
	            {
	                if(j%2 != 0)
	                {
	                    System.out.print((n + ((2 * (rows + 1 - i)) - 1)) + " ");
	                    n = n + ((2 * (rows + 1 - i)) - 1);
	                }
	                else
	                {
	                    System.out.print((n + 2 * (i - j)) + " ");
	                    n = n + 2 * (i - j);
	                }
	            }
	            System.out.println();
	        }
	    
	         
	        //Close the resources
	         
	        scanner.close();
	    }
	}
