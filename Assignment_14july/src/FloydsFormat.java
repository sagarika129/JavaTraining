import java.util.Scanner;
public class FloydsFormat {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of row");
		int row=sc.nextInt();
		int i=1;
		while(i<=row)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println(" ");
			i++;
		}

	}

}
