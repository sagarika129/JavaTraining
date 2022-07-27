/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.
If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America"*/


import java.util.Scanner;

public class RemoveX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String lc=s.toLowerCase();
		if(lc.charAt(0)=='x' && lc.charAt(lc.length()-1)=='x')
		{
			System.out.println(s.substring(1, s.length()-1));
		}
		else
		{
			System.out.println(s);
		}
	}

}
