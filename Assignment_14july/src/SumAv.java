
public class SumAv {

	public static void main(String[] args) {
		int ar[]= {5,8,6,4,7,9};
		int sum=0,av=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		av=sum/ar.length;
		System.out.println("Sum = "+sum);
		System.out.println("average = "+av);
	}

}
