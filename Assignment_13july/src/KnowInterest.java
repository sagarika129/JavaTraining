import java.util.Scanner;
public class KnowInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Gender");
		String gn=sc.nextLine();
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		String f="Female";
		String m="Male";
		if(gn.equalsIgnoreCase(f))
		{
		if(age>0 && age<60)
		{
		System.out.println("8.2%");
		}
		else if(age>59 && age<=100)
		{
		System.out.println("9.2%");
		}

		}
		else if(gn.equalsIgnoreCase(m))
		{
		if(age>0 && age<59)
		{
		System.out.println("8.4%");
		}
		else if(age>58 && age<=100)
		{
		System.out.println("10.5%");
		}
		}
		else
		{
		System.out.println("Enter gender either female or male");
		}


	}

}
