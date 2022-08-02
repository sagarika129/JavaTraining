import java.util.Scanner;
public class DisplayChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first char");
		char a=sc.next().charAt(0);
		System.out.println("Enter second char");
		char b=sc.next().charAt(0);
		if(a<b)
		{
		System.out.print(a+","+b);
		}
		else
		{
		System.out.print(b+","+a);
		}
	}

}
