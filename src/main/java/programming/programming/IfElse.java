package programming.programming;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int marksObtained;
			int passingMarks=40;
			
			Scanner scanner= new Scanner(System.in);
			System.out.println("input marks scored by you");
			marksObtained=scanner.nextInt();
			if(marksObtained>=passingMarks)
			{
				System.out.println("You have passed the exams");
			}
			else {
				System.out.println("Unfortunately you are failed in exam");
			}
			scanner.close();
			
	}

}
