import java.util.*;
public class ArrIterator {
	public static void main(String args[])
	{
		ArrayList<String> months=new ArrayList<String>();
		months.add("January");
		months.add("February ");
		months.add("March");
		months.add("April");
		printAll(months);
	}
	static void printAll(ArrayList<String> months)
	{
		Iterator i=months.iterator();

        while (i.hasNext())
            System.out.println(i.next()+" ");
  
	}
}
