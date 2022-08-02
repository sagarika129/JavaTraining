import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		long inp=sc.nextLong();
		int length=Long.toString(inp).length();
		long num=0;
		for(int i=0;i<length;i++)
		{
			num=num*10+inp%10;
			inp=inp/10;
		}
		System.out.println(num);
	}

}

