public class MinNumber
{
	public static void main(String[] args)
	{
		int [] arr = {94,39,29,10,89,79,40,74,32,56,72,92,67,44};
		for(int i=1; i< arr.length; i++)
		{
			if(arr[i] < arr[0])
			{
				arr[0] = arr[i];
			}
		}
		System.out.println("Minimum Number is:" +arr[0]);
	}
}