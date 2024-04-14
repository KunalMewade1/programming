package programming.programming;

public class SumOFDigit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		for(int i=0;i<=200;i++)
		{
			if(i%7==00)
			{
				result=result+i;
			}
		}
		System.out.println("Output of the program is" +result);

	}

}
