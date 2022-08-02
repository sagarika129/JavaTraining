
public class Divisible {
	public static void main(String args[])
	{
		int count=0;
		int i=1;
		while(i>0)
		{
			if(count==5)
			{
				break;
			}
			else
			{
				if(i%5==0 && i%2==0 && i%3==0)
				{
					count++;
					System.out.print(i+" ");
				}
			}
			i++;
		}
	}

}
