import java.util.Scanner;
public class ArrayIndexEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the array");
		int l=sc.nextInt();
		int ar[]=new int[l];
		for(int i=0;i<l;i++)
		{
			ar[i]=sc.nextInt();
		}
		try {
			System.out.println("Enter array index to search");
			int i=sc.nextInt();
			System.out.println(ar[i]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
	}

}
