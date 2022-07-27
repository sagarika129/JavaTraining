import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GetContactInfo {

	public static void main(String[] args) {
		HashMap<String,Integer> ContactList=new HashMap();
		ContactList.put("A",789066);
		ContactList.put("B",675123);
		ContactList.put("C",12578);
		ContactList.put("D",890439);
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Name");
		String k=sc.nextLine();
		if(ContactList.containsKey(k))
		{
			System.out.println("Name exists");
		}
		else
			System.out.println("Name doesn't exist");

		System.out.println("Enter Contact no");
		String v=sc.nextLine();
		if(ContactList.containsValue(v))
		{
			System.out.println(" Contact no exists");
		}
		else
			System.out.println("Contact no doesn't exist");
		
		Iterator<Map.Entry<String, Integer>> i = ContactList.entrySet().iterator();
		
		while(i.hasNext())
		{
			Map.Entry<String, Integer> it = i.next();
			System.out.println(it.getKey()+" "+it.getValue());
		}

	}

}
