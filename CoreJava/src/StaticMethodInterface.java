//Static method in interface

interface Demo{
	
	int a=90;    //this is by default final , no matter if you do not even write final keyword
	void display();
	static void show() {
		System.out.println("Hello");
	}
}
public class StaticMethodInterface {
	public static void main(String[] args) {
       		
		Demo.show(); //calling show method of interface
		
		
	}
}
