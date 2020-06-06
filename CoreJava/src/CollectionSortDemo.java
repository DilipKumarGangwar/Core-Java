import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortDemo {
	public static void main(String[] args) {
		
		List<Integer>  c = new ArrayList<Integer>();  //Arraylist Class Implements List interface(directly)
		List<Integer>  c2 = new ArrayList<Integer>();
		c.add(1);
		c.add(2);
		c.add(50);
		
		
		System.out.println("List in Ascending order");
		Collections.sort(c);
		for (int i = 0; i < c.size(); i++) {
			System.out.print(c.get(i)+ " ");
		}
		System.out.println();
		
		System.out.println("List in Descending order");
		Collections.reverse(c);
		for (int i = 0; i < c.size(); i++) {
			System.out.print(c.get(i)+ " ");
		}
		
	
		
	}
}
