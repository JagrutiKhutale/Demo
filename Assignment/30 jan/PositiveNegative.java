import java.util.Scanner;
public class PositiveNegative 
{
	public static void main(String [] Args)
	{
		System.out.println("Enter the Number: ");
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		if(num>0)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number is Negative");
		}
	}
}