import java.util.Scanner;
public class SumOfDigits {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		long num=sc.nextLong();
		int length=Long.toString(num).length();
		long sum=0;
		for(int i=0;i<length;i++)
		{
			sum=sum+num%10;
			num=num/10;
		
		}
		System.out.println(sum);
		
	}
}
