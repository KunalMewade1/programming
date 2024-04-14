package programming.programming;

public class Parent extends GrandParent {
	int b;
	Parent(int a, int b){
		super(a);
		this.b=b;
		
	}
	void show() {
		System.out.println("GrandParent's a"+a);
		System.out.println("parent b"+b);
	}

}
