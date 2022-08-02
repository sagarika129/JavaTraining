import java.util.Scanner;
public class CheckChar {

	public static void main(String[] args) {
		char c='&';
		if(Character.isDigit(c))
		{
		System.out.print("Digit");
		}
		else if(Character.isAlphabetic(c))
		{

		System.out.print("Alphabetic");
		}
		else
		{
		System.out.print("Special Character");
		}

	}

}
