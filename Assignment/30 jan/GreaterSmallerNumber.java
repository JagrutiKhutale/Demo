import java.util.Scanner;
public class GreaterSmallerNumber
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter the Second Number: ");
		int number2 = sc.nextInt();
		
		if(number1 > number2)
		{
			System.out.println(number1+" is Greater");
		}
		else if(number1 < number2)
		{
			System.out.println(number1+ " is Smaller");
		}
		else
		{
			System.out.println(number1+ " and " +number2+ " is equal");
		}
	}
}