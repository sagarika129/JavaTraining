
public class LargestSmallest {

	public static void main(String[] args) {
		int arr[]= {6,1,3,12,76,34,21,90,21,6};
		int l1=0,l2=0;
		int sm1=arr[0];
		int sm2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>l1)
			{
				l1=arr[i];
			}
			if(sm1>arr[i])
			{
				sm1=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(l2<arr[i] && arr[i]<l1)
			{
				l2=arr[i];
			}
			if(sm2>arr[i] && arr[i]>sm1)
			{
				sm2=arr[i];
			}
			
		}
		System.out.println(" largest "+l1);
		System.out.println(" second largest "+l2);
		System.out.println(" smallest "+sm1);
		System.out.println("  second smallest "+sm2);
		

	}

}
