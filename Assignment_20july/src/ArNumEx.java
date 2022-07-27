import java.util.Scanner;
public class ArNumEx {

	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter length of the array");
			int l=sc.nextInt();
			int ar[]=new int[l];
			for(int i=0;i<l;i++)
			{
				ar[i]=sc.nextInt();
			}
			System.out.println("Enter array index to search");
			String j=sc.nextLine();
			try {
				
				String i=sc.nextLine();
				int k=Integer.parseInt(i);
				System.out.println(ar[k]);
			}
			catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println(ae);
			}
			catch(NumberFormatException ne) {
				System.out.println(ne);
				
			}
		}

	}

