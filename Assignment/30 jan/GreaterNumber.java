import java.util.Scanner;
public class GreaterNumber
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter the Second Number: ");
		int number2 = sc.nextInt();
		if(number1>number2)
		{
			System.out.println("First Number is Greater");
		}
		else if(number1<number2)
		{
			System.out.println("Second Number is Greater");
		}
		else
		{
			System.out.println("Both are Equal");
		}
	}
}