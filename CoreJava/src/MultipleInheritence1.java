class X
{
	
	
}

class Y{
	
	void show()
	{
		System.out.println("In Z");
	}
}

class Z extends Y{
	
	
}
public class MultipleInheritence1 {
	public static void main(String args[]){
		
		Z z = new Z();
		z.show();
		
	}
}
