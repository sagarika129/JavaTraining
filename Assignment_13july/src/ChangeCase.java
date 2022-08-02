import java.util.Scanner;
public class ChangeCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character to change case");
		char ch=sc.next().charAt(0);
		if(Character.isLowerCase(ch))
		{
		System.out.println(Character.toUpperCase(ch));
		}
		else
		{
		System.out.println(Character.toLowerCase(ch));
		}
	}

}
