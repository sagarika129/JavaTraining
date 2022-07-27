/*11)Given two strings a and b, return a new string, following the rules given below.

If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.

Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.

Example1)

i/p:abcXY123XYijk,XY

o/p:c13i

Example2)

i/p:XY123XY,XY

o/p:13

Example3)

i/p:XY1XY,XY

o/p:11







*/


import java.util.Scanner;
public class BeforeAfter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String st1=sc.nextLine();
		System.out.println("enter substring");
		String st2=sc.nextLine();
		String arr[]=st1.split(st2);
	
		if(st1.contains(st2))
		{
				for(int i=0;i<arr.length;i++)
				{
					int ln=arr[i].length();
					ln=ln-1;
					System.out.println(arr[i].charAt(ln));
				
				
				}
		}
		

	}

}
