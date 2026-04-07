public class ReverseArray
{
	public static void main(String[] args)
	{
		int[] arr= {26,37,10,89,78};
		int index=arr.length-1;
		while(index>= 0)
		{
			System.out.print(arr[index]+", ");
			index--;
		}
	}
}