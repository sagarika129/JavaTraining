import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String s=sc.nextLine();
	char ch[]=s.toCharArray();
	String st="";
	for(int i=ch.length-1;i>=0;i--)
	{
		st=st+ch[i];
		
	}
		if(st.equalsIgnoreCase(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
