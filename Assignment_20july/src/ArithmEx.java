import java.util.Scanner;
public class ArithmEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend");
		int d1=sc.nextInt();
		System.out.println("Enter Divisor");
		int d2=sc.nextInt();
		
		try {
			int res=d1/d2;
			System.out.println("result "+res);
			
		
		}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	

	}

}
