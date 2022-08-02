import java.util.Scanner;
public class FindValue {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]= {6,45,89,43,81,23,12,8,32};
		System.out.println("enter a value to search");
		int val=sc.nextInt();
		boolean f=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				System.out.println(i);
				f=true;
				break;
			}
			
		}
		if(f==false)
		{
			System.out.println(-1);
		}
		
	}


}
