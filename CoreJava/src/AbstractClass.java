
abstract class stationary{
	abstract void write();
	void example()
	{
		System.out.println("Just for Demo");
	}
	
}
class Pen extends stationary{
	
	void write() {
		System.out.println("I write by pen");
	}
}

class Pencil extends stationary{
	void write() {
		System.out.println("I write by pencil");
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		//stationary stationary= new stationary();   //Not valid, cannot make object of abstract class

		Pen p=new Pen();
		p.write();
		
		Pencil pn = new Pencil();
		pn.write();
	}

}
