/*
3) Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.

Example1)

i/p:Hello

o/p:HeHeHeHeHe*/

import java.util.Scanner;
public class NcopiesString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String st=s.substring(0, 2);
		String sn="";
		for(int i=0;i<s.length();i++)
		{
			sn=sn+st;
		}
		System.out.println(sn);
	}

}
