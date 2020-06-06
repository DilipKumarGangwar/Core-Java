//Sort Student list in ascending order by marks , then by roll no  using comparable Interface

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	
	int rollno;
	String name;
	int marks;
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	//Implement CompareTo() of Comparable interface
	// Sort by marks in ascending order
	public int compareTo(Student s) {                   
		return this.marks > s.marks? 1: -1;   //swap if 1st marks > 2nd marks 
	}
	
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		
		List<Student> stu=new ArrayList<Student>();
        stu.add(new Student(30, "Dilip", 100));
        stu.add(new Student(20, "Ram", 150));
        stu.add(new Student(45, "Kuldeep", 10));
        
        Collections.sort(stu);
       // Collections.sort(stu,(a,b)-> a.marks>b.marks ? 1 : -1 );   //other way to sort without explicit compareTo()
        System.out.println("List in Ascending order by marks ");
		
		for (Student student : stu) {           
			System.out.println(student);  //for this printing, we have toString() in our class
		}
		
		
		System.out.println("\nList in Ascending order by Roll no");
		Collections.sort(stu,(a,b)-> a.rollno>b.rollno ? 1 : -1 );    //as comparable is Functional Interface
			
		for (Student student : stu) {           
			System.out.println(student);  //for this printing, we have toString() in our class
		}
	}

}
