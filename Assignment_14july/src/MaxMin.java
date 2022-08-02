
public class MaxMin {

	public static void main(String[] args) {
		int arr[]= {3,8,32,90,35,21,1,8};
		int max=0;
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum value "+max);
		System.out.println("Minimum value "+min);
	}

}
