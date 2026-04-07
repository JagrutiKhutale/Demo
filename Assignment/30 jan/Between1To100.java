import java.util.Scanner;
public class Between1To100
{
	public static void main(String[] Args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		
		if(number>0 && number<100)
		{
			System.out.println("Number is Between 1 to 100");
		}
		else
		{
			System.out.println("Number is not Between 1 to 100");
		}
	}
}