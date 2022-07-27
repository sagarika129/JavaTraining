//Write a program that will have a Vector which is capable of storing Employee objects. Use an Iterator and enumeration to list all the elements of the Vector.
import java.util.*;
public class ObjVector {

	public static void main(String[] args) {
	Vector<Employee> ve=new Vector();
	ve.add(new Employee(1));
	ve.add(new Employee(2));
	ve.add(new Employee(3));
	ve.add(new Employee(4));
	 Enumeration<Employee> en = ve.elements();
	 System.out.println("Displaying elements using Enumeration ");
	 while(en.hasMoreElements())
	 {
		en.nextElement().display();
	 }
	 System.out.println();
	 System.out.println("Displaying elements using Iterator");
	 Iterator <Employee> ie=ve.iterator();
	 while(ie.hasNext()) {
			ie.next().display();
	 }

	}

}
class Employee{
	int Id;
	Employee(int x)
	{
		Id=x;
	}
	void display()
	{
		System.out.println("Employee "+Id);
	}
	
}
