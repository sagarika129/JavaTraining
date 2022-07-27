//Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator
import java.util.*;
public class EmpHashSet {

	public static void main(String[] args) {
		HashSet<String> emp=new HashSet();
		emp.add("Employee1");
		emp.add("Employee2");
		emp.add("Employee3");
		Iterator i=emp.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

	}

}
