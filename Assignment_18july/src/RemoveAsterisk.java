/*Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *

Example1)

i/p:ab*cd

o/p:ad*/


import java.util.Scanner;

public class RemoveAsterisk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String arr[]=s.split("\\*");
		String st="";
		for(int i=1;i<arr.length-1;i++)
		{
			st=st+arr[i].substring(1,(arr[i].length()-1));
		}
		st=arr[0].substring(0,arr[0].length()-1)+st;
		st=st+arr[arr.length-1].substring(1);
		System.out.println(st);

	}

}
