import java.util.Scanner;
public class EvenOdd
{
	public static void main(String [] Args)
	{
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number%2 ==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}