
public class PrintPrime {

	public static void main(String[] args) {
		for(int j=10;j<=99;j++)
		{
			boolean res=true;
			for(int i=2;i<j;i++)
			{
				if(j%i==0)
				{
					res=false;
					break;
				}
			}
			if(res==true)
			{
				System.out.print(j+" ");
			}
		}

	}

}
