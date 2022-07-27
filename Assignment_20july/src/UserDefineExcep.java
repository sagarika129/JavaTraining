
import java.util.Scanner;
public class UserDefineExcep {

	public static void main(String[] args) throws MyException {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter name of the first Student");
			String nm1=sc.nextLine();
			int arr1[]=new int[3];
			int arr2[]=new int[3];
			System.out.println("Enter marks of the student1");
			for(int i=0;i<arr1.length;i++)
			{
				arr1[i]=Integer.parseInt(sc.nextLine());
				
				if(arr1[i]>100 || arr1[i]<0)
				{
						throw new MyException("Out of range");
				}
			}
			String n=sc.nextLine();
			System.out.println("Enter name of the second Student");
			String nm2=sc.nextLine();
			System.out.println("Enter marks of the student2");
			for(int i=0;i<arr1.length;i++)
			{
				arr2[i]=sc.nextInt();
				
				if(arr2[i]>100 || arr2[i]<0)
				{
						throw new MyException("Out of range");
				}
			}
			int av1=(arr1[0]+arr1[1]+arr1[2])/3;
			int av2=(arr2[0]+arr2[1]+arr2[2])/3;
			System.out.println("Average marks of "+nm1+" "+av1);
			System.out.println("Average marks of "+nm2+" "+av2);
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Enter valid marks");
		}
		
	}

}
class MyException extends Exception

{

 public MyException(String s)
 {

 System.out.println(s);

 }

}
