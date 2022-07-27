
public class CmdArray {

	public static void main(String[] args) {
		int sum=0;
		try {
				for(int i=0;i<5;i++)
				{
				sum=sum+Integer.parseInt(args[i]);
				}
				int avg=sum/5;
				System.out.println("sum "+sum);
				System.out.println("average "+avg);
				
			
			}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
		catch(NumberFormatException ne) {
			System.out.println(ne);
		}

	}

}
