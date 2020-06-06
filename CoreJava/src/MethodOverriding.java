
class P{
	void show() {
		System.out.println("In P");
	}
	
}

class Q extends P{
	@Override               //this annotation helps to avoid run time error if we somehow write say show1() instead of show here
	void show() {
		System.out.println("In Q");
	}
}


class R extends P{
	
	@Override
	void show() {
		super.show();          //with this super keyword, we can call  super class show() also
		System.out.println("In R");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Q q= new Q();
		System.out.println("Calling Q's show");
		q.show();    
		
		R r=new R();
		System.out.println("Calling R's show");
		r.show();
		

	}

}
