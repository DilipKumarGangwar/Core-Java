//Encapsulation: Hiding the data or Binding the data with methods, so that it is only accessible via methods of that class , but not directly

class Person{
	
	int id;
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Person p=new Person();
		//p.id=1;      Although possible , but it breaks encapsulation as Data should not be directly accessible to the client
		//p.name="Dilip";       //it is now not valid as name is made private to have the Encapsulation 
		
		//Set the data of object (Person), Object state can be changed only via methods of that class => Encapsulation is achieved
		p.setName("Dilip");
		p.setAddress("India");
		
		//Get the data
		System.out.println("Name="+p.getName());
		System.out.println("Address="+p.getAddress());
		
	}
	
}
