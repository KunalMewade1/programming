package programming.programming;

public class Methods {
	public static void main(String[] args) {
	
		Methods object= new Methods();
		object.nonStaticMethod();
		Methods.staticMethod();
		
		
	}
	Methods(){
		System.out.println("constructor method is called when an object of it's class is created");
		
	}
	void nonStaticMethod()
	{
		System.out.println("no static method can't be called without creating object");
	}
	static void staticMethod(){
		System.out.println("Static mathod can be called without creating object");
	}
	

}
