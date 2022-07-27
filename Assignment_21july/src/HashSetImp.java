/*Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,

the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).

Develop a method getCountry(String CountryName) which iterates through the HashSet and

returns the country if exist else return null.

NOTE: You can test the methods using a main method. */
import java.util.*;
public class HashSetImp {
	static HashSet<String> H1=new HashSet();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String []ar= {"India","Argentina","Iceland","France"};
		for(int i=0;i<ar.length;i++)
		H1=(HashSet)saveCountryNames(ar[i]).clone();
		
		System.out.println("Enter a country name");
		
		System.out.println(getCountry(sc.nextLine()));

	}
	static HashSet<String> saveCountryNames(String CountryName)
	{
		H1.add(CountryName);
		return H1;
	}
	static String getCountry(String CountryName)
	{
		if(H1.contains(CountryName))
			return CountryName;
		else
		return "null";
	}

}
