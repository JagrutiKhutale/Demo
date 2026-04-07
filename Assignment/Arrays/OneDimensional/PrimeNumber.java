public class PrimeNumber
{
	public static void main(String[] args)
	{
		int[] arr= { 27,36,2,5,77,44,17,31,66,85,98,37};
		int index = 0 ;
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i] % 1 == 0 && arr[i]% arr[i] == 0)
			{
				System.out.println(arr[i]);
				
			}
		}
	}
}