/*Create a Collection called HashMap which is capable of storing String objects.

 The program should have the following abilities

a) Check if a particular key exists or not.

b) Check if a particular value exists or not.

c) Use Iterator to loop through the map.*/
import java.util.*;
public class TryHashMap {

	public static void main(String[] args) {
		HashMap<String,String> h=new HashMap();
		h.put("key1","CSE");
		h.put("key2","CE");
		h.put("key3","ECE");
		h.put("key4","IT");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Key");
		String k=sc.nextLine();
		if(h.containsKey(k))
		{
			System.out.println("key exists");
		}
		else
			System.out.println("key doesn't exist");

		System.out.println("Enter a value");
		String v=sc.nextLine();
		if(h.containsValue(v))
		{
			System.out.println("value exists");
		}
		else
			System.out.println("value doesn't exist");
		
		Iterator<Map.Entry<String, String>> i = h.entrySet().iterator();
		
		while(i.hasNext())
		{
			Map.Entry<String, String> it = i.next();
			System.out.println(it.getKey()+" "+it.getValue());
		}

	}

}
