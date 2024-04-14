package starPatterns;

import java.util.Scanner;

public class StarPattern5 {

	
		public static void main(String[] args)
		/*
		Here is your pattern....!!!
	      * 
	     * * 
	    * * * 
	   * * * * 
	  * * * * * 
	 * * * * * * 
	* * * * * * * 
	*/
	    {
	        Scanner sc = new Scanner(System.in);

	        //Taking rows value from the user

	        System.out.println("How many rows you want in this pattern?");

	        int rows = sc.nextInt();

	        System.out.println("Here is your pattern....!!!");
	        
	        for (int i= 0; i<= rows-1 ; i++)
	        {
	            for (int j=rows-1; j>i; j--)
	            {
	                 System.out.print(" ");
	            }
	            for (int k=0; k<=i; k++)
	            {
	                 System.out.print("*" + " ");
	            }
	            System.out.println();
	        }

	        //Close the resources
	        sc.close();

	    }
	}


