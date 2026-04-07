import java.util.Scanner;
public class LessThan50
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		
		if(number<50)
		{
			System.out.println("Number is Less than 50");
		}
		else
		{
			System.out.println("Number is not Less than 50");
		}
	
	}
}