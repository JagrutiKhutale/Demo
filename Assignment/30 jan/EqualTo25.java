import java.util.Scanner;
public class EqualTo25
{
	public static void main(String[] Args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		
		if(number == 25)
		{
			System.out.println("Equal to 25");
		}
		else
		{
			System.out.println("Not Equal to 25");
		}
	}
}