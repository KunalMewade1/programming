package pattern;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,numberOfStars;
		for(row=1;row<=10;row++)
		{
			for(numberOfStars=1;numberOfStars<=row;numberOfStars++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
