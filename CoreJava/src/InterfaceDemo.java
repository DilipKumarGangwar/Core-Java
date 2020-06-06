//Interface are like a contract between the implementation guy and user
interface Writer{
	void write();
}


class Implementor implements Writer{
	public void write() {
		System.out.println("I am writing");
		
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
        // Writer writer = new Writer() ;    //wrong cannot make object of Interface 
		
		Writer writer = new Implementor();
		writer.write();
	}

}
