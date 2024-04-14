package programming.programming;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String languages[]= {"c","c++","java","perl","python","go"};
		try {
			for(int i=1;i<=5;i++) {
			System.out.println(languages[i]);}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
