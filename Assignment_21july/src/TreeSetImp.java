
import java.util.*;
import java.util.Scanner;
public class TreeSetImp {

	static TreeSet<String> T1=new TreeSet();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String []ar= {"India","Argentina","Iceland","France"};
		for(int i=0;i<ar.length;i++)
		T1=(TreeSet)saveCountryNames(ar[i]).clone();
		
		System.out.println("Enter a country name");
		
		System.out.println(getCountry(sc.nextLine()));

	}
	static TreeSet<String> saveCountryNames(String CountryName)
	{
		T1.add(CountryName);
		return T1;
	}
	static String getCountry(String CountryName)
	{
		if(T1.contains(CountryName))
			return CountryName;
		else
		return "null";
	}

}
