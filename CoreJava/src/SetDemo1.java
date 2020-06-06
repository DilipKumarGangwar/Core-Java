/* Insert elements in Hashset and print them
 * Hashset does not preserve order of insertion, and do not allow duplicates 
 * 
 * 
 */
import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
	public static void main(String[] args) {
		
		Set<Integer> s1=new HashSet<Integer>();   
		
		s1.add(23);
		s1.add(53);
		s1.add(233);
		s1.add(81);
		
		for (Integer i : s1) {
			System.out.println(i + " ");
		}
		
		
	}
}
