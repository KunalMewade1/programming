package programming.programming;

import java.util.Scanner;

public class SubStringsOfString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Print a string to print it's all substrings");
		
		String string=scanner.nextLine();
		int length=string.length();
		System.out.println("substring of"+string+"are:");
		String sub="";
		for(int i=0;i<length;i++) {
			for(int c=1;c<=length-1;c++) {
				//String sub="";
				System.out.println(sub=string.substring(i, i+1));
				scanner.close();
				
			}
			
		}

	}

}
