package programming.programming;

public class Allocate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			long data[]= new long[1000000000];
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block will always be executed");
		}

	}

}
