package programming.programming;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number= scanner.nextInt();
		String result="";
		for(int i=0;i<=number;i++)
		{
			result=result+i+"";
		}
		
       System.out.println(result);
       scanner.close();
	}

}
