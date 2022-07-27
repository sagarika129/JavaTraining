import java.util.Scanner;
public class NumberFormat {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no ");
		String s=sc.nextLine();
		
		try {
			int x=Integer.parseInt(s);
			System.out.println(x*x);
		}catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
	}

}
