package programming.programming;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ,b , result;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Input two integers");
		
		a=scanner.nextInt();
		b=scanner.nextInt();
		try {
			result=a/b;
			System.out.println("Result"+result);
			
		} catch (Exception e) {
			// TODO: handle exception	
			System.out.println("exception Caught:Divison by zero");
		}
		
				scanner.close();
	}

}
