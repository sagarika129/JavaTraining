import java.util.*;
public class TreeSetExp {

	public static void main(String[] args) {
		TreeSet<String> tset=new TreeSet();
		tset.add("A");
		tset.add("B");
		tset.add("C");
		tset.add("D");
		System.out.println("Reverse of elements"+tset.descendingSet());
		Iterator i=tset.iterator();
        while (i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a elemnt to search");
        if(tset.contains(sc.nextLine()))
        {
        	System.out.println("Exists");
        }
        else
        {
        	System.out.println(" Doesn't Exist");
        }
	}

}
