package starPatterns;

import java.util.Scanner;

public class StarPattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Here is your Pattern
       * 
      * * 
     * * * 
    * * * * 
   * * * * * 
  * * * * * * 
 * * * * * * * 
  * * * * * * 
   * * * * * 
    * * * * 
     * * * 
      * * 
       * 
        
		 */
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=rows-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=-1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-2-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
		scanner.close();

	}

}
