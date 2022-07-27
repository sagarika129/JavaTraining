//Write a Java program to create an Vector, add all the months of a year and print the same.
import java.util.*;
public class VectorImp {

	public static void main(String[] args) {
		Vector<String> vec=new Vector();
		vec.add("January");
		vec.add("February ");
		vec.add("March");
		vec.add("April");
		vec.add("May");
		vec.add("June");
		vec.add("July");
		vec.add("August");
		vec.add("September");
		vec.add("October");
		vec.add("November");
		vec.add("December");
		for(int i=0;i<12;i++)
			System.out.print(vec.get(i)+" ");

	}

}
