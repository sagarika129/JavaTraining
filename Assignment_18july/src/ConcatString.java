/*Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
*/
import java.util.Scanner;
public class ConcatString {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String st1=sc.nextLine();
		System.out.println("Enter second string");
		String st2=sc.nextLine();
		st1=st1.toLowerCase();
		st2=st2.toLowerCase();
		String st3="";
		if(st1.charAt(st1.length()-1)==st2.charAt(0)){
			for(int i=0;i<st1.length()-1;i++)
			{
				st3=st3+st1.charAt(i);
			}
		}
			else
			{
				st3=st1+st2;
			}
		
		
		System.out.println(st3);
		
		
	}
}
