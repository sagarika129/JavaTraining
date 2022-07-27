import java.util.*;
public class GetProperties {

	public static void main(String[] args) {
		Properties p=new Properties();
	
	}

}
class Properties{
	Properties(){
	HashMap<String,String> h=new HashMap();
	h.put("West Bengal","Kolkata");
	h.put("Rajasthan","Jaipur");
	h.put("Sikkim","Gangtok");
	
	Set<String> k=h.keySet();
	for(String s:k)
	{
		System.out.println(s+" "+h.get(s));
	}
	}
}
