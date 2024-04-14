package programming.programming;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1+1/2+1/3+1/4+1/5..................
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number for harmonic series");
		int number=scanner.nextInt();
		
		double result=0.0;
		while(number>0)
		{
			result=result+(double)1/number;
			number--;
			
		}
         System.out.println("Output of the harmonic series is"+result);
         scanner.close();
	}
       
}
