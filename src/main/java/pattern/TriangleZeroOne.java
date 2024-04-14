package pattern;

public class TriangleZeroOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(((i+j)%2)+" ");
			}
			System.out.print("\n");
		}
	}

}
