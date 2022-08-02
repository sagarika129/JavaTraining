import java.util.Scanner;
public class CheckNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int i=sc.nextInt();
		if(i<0)
		{
		System.out.println("Negative");
		}
		else if(i==0)
		{
		System.out.println("Zero");
		}
		else
		{
		System.out.println("positive");
		}


	}

}
