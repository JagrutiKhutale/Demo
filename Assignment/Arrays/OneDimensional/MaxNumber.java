public class MaxNumber
{
	public static void main(String[] args)
	{
		int[] arr = { 1,78,33,59,95,43,68};
		for(int i=1; i< arr.length; i++)
		{
			if(arr[i] > arr[0])
			{
				arr[0] = arr[i];
			}
		}
			System.out.println("Max number is: " + arr[0]);
	}
}