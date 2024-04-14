package programming.programming;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		System.out.println(" enter the number for the series");
		int number=scanner.nextInt();
		int f1,f2=0,f3=1;
		for(int i=1;i<=number;i++) {
			System.out.println("======================="+f3+"=========================");
			f1=f2;
			f2=f3;
			f3=f1+f2;
			
			
		}
       System.out.println(f3);
       scanner.close();
	}

}
