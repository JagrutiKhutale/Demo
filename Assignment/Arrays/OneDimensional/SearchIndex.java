import java.util.Scanner;
public class SearchIndex
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [] arr={94,39,29,10,89,79,40,74,32,56,72,92,67,44};
		
		System.out.println("Enter element to search: ");
		int search = sc.nextInt();
		
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i] == search)
			{
				System.out.println("Element found at index: " + i);
			}
		}
		
	}
}