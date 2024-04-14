package programming.programming;

import java.util.Scanner;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Enter the integers");
		Scanner in= new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
		in.close();
		if(x>y&&x>z)
			System.out.println("First number is largest");
		else if(y>x&&y>z)
			System.out.println("second number is largest");
		else if(z>x&&z>y)
	      System.out.println("Third number is largest");
		//in.close();
	}

}
