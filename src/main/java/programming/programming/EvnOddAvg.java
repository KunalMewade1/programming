package programming.programming;

import java.util.Scanner;

public class EvnOddAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		int cntEven=0,cntOdd=0, sumEven=0,sumOdd=0;
		while(number>0)
		{
			if(number%2==0) {
				cntEven++;
				sumEven=sumEven+number;
				
			}
			else {
				cntOdd++;
				sumOdd=sumOdd+number;
			}
			number--;
		}
		int evenAvg=sumEven/cntEven;
		int oddAvg=sumOdd/cntOdd;
		
		System.out.println("Average of first n even number is" + evenAvg);
		System.out.println("Average of first n odd number is" + oddAvg);
		
          scanner.close();
	}

}
