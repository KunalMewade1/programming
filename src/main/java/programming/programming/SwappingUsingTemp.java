package programming.programming;

import java.util.Scanner;

public class SwappingUsingTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number first");
		int x=scanner.nextInt();
		System.out.println("enter the number second");
		int y=scanner.nextInt();
		
		System.out.println("before swapping \n x ="+x+"\n y="+y);
		int temp;
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After  swapping \n x="+x+"\n y="+y);
		scanner.close();

	}

}
