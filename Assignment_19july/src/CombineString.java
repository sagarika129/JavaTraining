import java.util.Scanner;
public class CombineString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String ns="";
		int ln=s1.length();
		if(s1.length()>s2.length())
		{
			ln=s2.length();
		}
		for(int i=0;i<ln;i++)
		{
			ns=ns+s1.charAt(i)+s2.charAt(i);
		}
		if(s1.length()>s2.length())
		{
			ns=ns+s1.substring(ln);
		}
		else
		{
			ns=ns+s1.substring(ln);
		}
		System.out.println(ns);

	}

}
