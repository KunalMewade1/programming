package programming.programming;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int number= scanner.nextInt();
		System.out.println("Mutltiplication table of number"+ number);
		for(int i=1;i<=number;i++)
		{
          for(int j=1;j<=number;j++) {
        	  System.out.println(""+i*j+"");
          }
         System.out.println("\n");
		}

		scanner.close();
	}

}
