/*Write a java program that accepts a string and returns a new string without the first and last character of the input string.*/
import java.util.Scanner;

public class RemoveFirstLastChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String sn1=s.substring(1, s.length()-1);
		System.out.println(sn1);

	}

}
