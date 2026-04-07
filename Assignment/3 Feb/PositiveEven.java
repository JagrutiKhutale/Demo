import java.util.Scanner;
public class PositiveEven
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		
		if(number>0 && number%2 == 0)
		{
			System.out.println("The number is Positive and Even");
		}
		else
		{
			System.out.println("The number is not Positive and Even");
		}
	}
}