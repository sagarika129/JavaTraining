import java.util.Scanner;
public class StringReptition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		System.out.println("Enter no of repetition");
		int n=sc.nextInt();
		int sub=s.length()-n;
		String st="";
		for(int i=0;i<n;i++)
		{
			st=st+s.substring(sub);
		}
		System.out.println(st);

	}

}
