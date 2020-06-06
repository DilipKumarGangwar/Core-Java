//List Supports the accessing of element by indexes

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CollectionDemo2 {

	public static void main(String[] args) {
		List<Integer>  c = new ArrayList<Integer>();  //Arraylist Class Implements List interface(directly)
		
		c.add(1);
		c.add(2);
		c.add(50);
		
	   //1st way to access list (without indexes)
		System.out.println("Access without  Indexes");
		Iterator iterator = c.iterator();    //   Iterator is Interface and iterator is method 
		//Iterate over all values in Collection   : Note We cannot iterate over indexes on Collection
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		
		//******2nd way ( by indexes)*****
		System.out.println("Access via Indexes");
		for (int i = 0; i < c.size(); i++) {
			System.out.print(c.get(i)+ " ");
		}
		
		System.out.println();
		
		//*******3rd way***************** 
		System.out.println("3rd way");
		for(Object ob : c) {
			System.out.print(ob+ " ");
		}
		

	}

}
