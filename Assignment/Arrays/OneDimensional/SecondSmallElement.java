public class SecondSmallElement
{
	public static void main(String[] args)
	{
		int [] arr = {10,5,20,8,15,21};
		int min=arr[0];
		int secondMin=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				secondMin=min;
				min=arr[i];
			}
			else if(arr[i]<secondMin && arr[i] != min)
			{
				secondMin=arr[i];
			}
		}
		System.out.println("Second Minimum Number: "+secondMin);
	}
}