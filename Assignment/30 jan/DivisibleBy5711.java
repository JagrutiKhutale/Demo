import java.util.Scanner;
public class DivisibleBy5711
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number= sc.nextInt();
		
		if(number%5 == 0)
		{
			System.out.println("Number is divisible by 5");
		}
		else if(number%7 == 0)
		{
			System.out.println("Number is divisible by 7");
		}
		else if(number%11 == 0)
		{
			System.out.println("Number is divisible by 11");
		}
		else
		{
			System.out.println("Given Number is not divisible by 5,7,11");
		}
	}
}