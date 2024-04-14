package programming.programming;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse=" ";
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String original=scanner.nextLine();
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse + original.charAt(i);
		}
		System.out.println("reverse of a string is" +reverse);
			scanner.close();
	}

}
