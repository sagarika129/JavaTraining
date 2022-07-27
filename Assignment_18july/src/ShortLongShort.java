/* Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi"
*/


import java.util.Scanner;

public class ShortLongShort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String sh=sc.nextLine();
		System.out.println("Enter another string");
		String ls=sc.nextLine();
		if(sh.length()<ls.length())
		{
		System.out.println(sh+ls+sh);
		}
		else if(sh.length()>ls.length())
			System.out.println(ls+sh+ls);
		else
			System.out.println("same length strings are not allowed");
	}

}
