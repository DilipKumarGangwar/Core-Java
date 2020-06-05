//Interface are like a contract between the implementation guy and user
//With Anonymous class , we can make object of Interface
interface Writer{
	void write();
}

//class Implementor implements Writer{
//	public void write() {
//		System.out.println("I am writing");
//		
//	}
//}
public class InterfaceAnonymousClassDemo {

	public static void main(String[] args) {
		
         Writer writer = new Writer() {
			
			@Override
			public void write() {
				System.out.println("I am writing");
				
			}
		};
		writer.write();
		
		
	}

}
