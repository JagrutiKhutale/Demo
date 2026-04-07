import java.util.Scanner;
public class GreaterThan100
{
	public static void main(String [] Args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		
		if(number > 100)
		{
			System.out.println("Number is Greater than 100");
		}
		else
		{
			System.out.println("Number is Less than 100");
		}
	}
}