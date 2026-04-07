public class HeterogeneousButActuallyItIsHomogeneousArray
{
	public static void main(String[] args)
	{
		Object[] arr = {10, 'J', 10.5f,"Jagruti", true };
		int index=0;
		while(index < arr.length)
		{
			System.out.println(arr[index]);
			index++;
		}
	}
}