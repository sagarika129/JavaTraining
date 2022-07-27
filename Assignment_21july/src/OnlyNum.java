//Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.
import java.util.*;
public class OnlyNum {

	public static void main(String[] args){
		ArrayList<Number> an=new ArrayList<>();
		Scanner sc=new Scanner(System.in);	
			an.add(6);
			an.add(5.78f);
			an.add(67.908);
			Iterator i=an.iterator();

	        while (i.hasNext())
	        {
	            System.out.println(i.next());
	        }
	}

}
