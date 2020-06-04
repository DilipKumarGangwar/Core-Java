class Employee{
	
	int id; 
	String name;
	double salary;
	
	static String cto;          //CTO will remain same for each Employee(object)
	
	static                  // This static block is loaded once  when class is loaded  initially
	{
		cto="Dennis";
	}
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCto() {
		return cto;
	}

	public void setCto(String cto) {
		this.cto = cto;
	}

	
	  
	
}


public class StaticBlock {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("Ravi");
		e1.setSalary(100000.5);
		
		
		Employee e2 = new Employee();
		e2.setId(100);
		e2.setName("Suresh");
		e2.setSalary(100000.5);
		
		
		
		System.out.println("Info of Emploee -"+ e1.getName());
		System.out.println("Id="+e1.getId()+" Name="+e1.getName()+" Salary="+e1.getSalary()+" CTO="+e1.getCto());
		
		System.out.println("\nInfo of Emploee -"+ e2.getName());
		System.out.println("Id="+e2.getId()+" Name="+e2.getName()+" Salary="+e2.getSalary()+" CTO="+e2.getCto());
		
		
		
	}

}
