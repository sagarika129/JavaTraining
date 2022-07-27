
import java.util.Scanner;
public class UserRegistration {
	public static void main(String[] args) throws InvalidCountryException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	String nm=sc.nextLine();
	System.out.println("Enter your Country");
	String C=sc.nextLine();
	registerUser(nm,C);

	}
	static void registerUser(String username,String userCountry) throws InvalidCountryException{
		String d="India";
		if(d.equalsIgnoreCase(userCountry))
		{
			System.out.println("User registration done successfully");
		}
		else
		{
			throw new InvalidCountryException();
		}
		
	}

}
class InvalidCountryException extends Exception
{
	InvalidCountryException()
	{
		System.err.println("User Outside India cannot be registered");
	}
	
}
