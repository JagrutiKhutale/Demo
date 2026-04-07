import java.util.Scanner;
public class MenuDrivenCalculator
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("***** Calculator *****");
		System.out.println("Addition: Choice 1" );
		System.out.println("Subtraction: Choice 2" );
		System.out.println("Multiplication: Choice 3" );
		System.out.println("Division: Choice 4" );
		System.out.println();
		
		System.out.println("Enter Your Choice: " );
		int choice = sc.nextInt();
		System.out.println();
		
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();
	
		
		if(choice == 1)
		{
			System.out.println("Addition: " + (num1+num2));
		}
		else if(choice == 2)
		{
			System.out.println("Subtraction: " +(num1-num2));
		}
		else if(choice == 3)
		{
			System.out.println("Multiplication: " +(num1*num2));
		}
		else if(choice == 4)
		{
			System.out.println("Division: " +(num1/num2));
		}
		else
		{
			System.out.println("Given Choice is out of range");
		}
		
		
		
		
		
	}
}