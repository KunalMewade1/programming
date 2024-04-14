package programming.programming;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="java programming";
		String t = "";
		String u="";
		System.out.println(s);
		int n=s.length();
		System.out.println("number of charcter in string "+ n);
		//replace character in String 
		t=s.replace("java", "C++");
		System.out.println(s);
		System.out.println(t);
		
		u=s.concat("is fun");
		System.out.println(u);
		

	}

}
