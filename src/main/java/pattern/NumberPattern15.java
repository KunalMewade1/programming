package pattern;
import java.util.*;
public class NumberPattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Here is your Pattern
		1010101
		0101010
		1010101
		0101010
		1010101
		0101010
		1010101*/
		 Scanner scanner= new Scanner(System.in);
		System.out.println("How many rows you want in this pattern");
		int rows=scanner.nextInt();
		System.out.println("Here is your Pattern");
		for(int i=1;i<=rows;i++) {
			int num;
			if(i%2==0) {
				num=0;
				for(int j=1;j<=rows;j++) {
					System.out.print(num);
					num=(num==0)?1:0;
				}
				
			}
			else {
				num=1;
				for(int j=1;j<=rows;j++) {
					System.out.print(num);
					num=(num==0)?1:0;
				}
			}
			System.out.println();
			
		}
		scanner.close();

	}

}
