import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {

	public static void main(String[] args) {
		Collection<Integer>  c = new ArrayList<Integer>();  //Arraylist Class Implements Collection interface(indirectly)
		
		c.add(1);
		c.add(2);
		c.add(34);
	
		Iterator iterator = c.iterator();    //   Iterator is Interface and iterator is method 
		
		//Iterate over all values in Collection   : Note We cannot iterate over indexes on Collection
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		

	}

}
