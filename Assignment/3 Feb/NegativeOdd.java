import java.util.Scanner;
public class NegativeOdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		
		if(number < 0 && number%2 != 0)
		{
			System.out.println("The number is Negative and Odd");
		}
		else
		{
			System.out.println("The number is not Negative and Odd");
		}
	}
}