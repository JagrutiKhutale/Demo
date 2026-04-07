import java.util.Scanner;
public class ZeroCheck
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		
		if(number==0)
		{
			System.out.println("Number is Zero");
		}
		else
		{
			System.out.println("Number is not Zero");
		}
	}
}