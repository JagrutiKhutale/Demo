import java.util.Scanner;
public class CheckRange 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int number=sc.nextInt();
		
		System.out.println("Enter the Minimum Range: ");
		int low=sc.nextInt();
		
		System.out.println("Enter the Maximum Range: ");
		int high=sc.nextInt();
		
		if(number>=low && number<=high)
		{
			System.out.println("Number lies in the given range");
		}
		else
		{
			System.out.println("Number does NOT lie in the given range");
		}
	}
}