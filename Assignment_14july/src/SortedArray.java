public class SortedArray {

	public static void main(String[] args) {
		int arr[]= {4,7,1,2,43,98,56,32,0};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
