/*Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.

Example1)

i/p:TomCat

o/p:Tom

Example2)

i/p:Apron

o/p:null
*/


import java.util.Scanner;

public class HalfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		if(s.length()%2==0)
		{
			System.out.println(s.substring(0,(s.length()/2)));
		}
		else
			System.out.println("Null");

	}

}
