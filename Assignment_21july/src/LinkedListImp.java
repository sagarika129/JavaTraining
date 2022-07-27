//Write a Java program to create an Linked List, add all the months of a year and print the same.
import java.util.*;
public class LinkedListImp {

	public static void main(String[] args) {
		LinkedList<String> ls=new LinkedList<String>();
		ls.add("January");
		ls.add("February ");
		ls.add("March");
		ls.add("April");
		ls.add("May");
		ls.add("June");
		ls.add("July");
		ls.add("August");
		ls.add("September");
		ls.add("October");
		ls.add("November");
		ls.add("December");
		for(int i=0;i<12;i++)
			System.out.print(ls.get(i)+" ");
	}

	}


