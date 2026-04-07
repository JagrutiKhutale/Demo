import java.util.Scanner;
public class SmallerNumber
{
	public static void main(String[] Args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int number2 = sc.nextInt();
		
		if(number1 < number2)
		{
			System.out.println("First Number is smaller");
		}
		else if(number1 > number2)
		{
			System.out.println("Second Number is Smaller");
		}
		else
		{
			System.out.println("Both Number is Equal");
		}
	}
}