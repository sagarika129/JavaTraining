import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a number");
		int inp=sc.nextInt();
		boolean res=true;
		for(int i=2;i<inp;i++)
		{
			if(inp%i==0)
			{
				res=false;
				break;
			}
		}
		if(res==true)
		{
			System.out.println(inp+" is a prime number");
		}
		else
		{
			System.out.println(inp+" is not a prime number");
		}

	}

}
