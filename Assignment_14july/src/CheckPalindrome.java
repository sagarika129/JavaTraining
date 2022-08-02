import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String r="";
		System.out.println("Enter a value");
		String inp=sc.nextLine();
		int length=inp.length();
	
		for(int i=length-1;i>=0;i--)
		{
			
			r=r+inp.charAt(i);
		}
		if(inp.equals(r))
		{
			System.out.println(r+" is palindrom");
		}
		else {
			System.out.println(inp+" is not a palindrome");
		}
		
		}
			


}

