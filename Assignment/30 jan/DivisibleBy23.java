import java.util.Scanner;
public class DivisibleBy23
{
	public static void main(String[] Args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		
		
		if(number%2 == 0 && number%3 == 0)
		{
			System.out.println("Number is Divisible By 2 and 3");
		}
		else if(number%2 == 0)
		{
			System.out.println("Number is Divisible by 2");
		}
		else if(number%3 == 0)
		{
			System.out.println("Number is Divisible by 3");
		}
		else
		{
			System.out.println("Number is not Divisible by 2 or 3");
		}
	}
}