import java.util.Scanner;
public class MultipleBy3
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		
		if(number%3 == 0)
		{
			System.out.println("Number is Multiply by 3");
		}
		else
		{
			System.out.println("Number is not Multiply by 3");
		}
	}
}