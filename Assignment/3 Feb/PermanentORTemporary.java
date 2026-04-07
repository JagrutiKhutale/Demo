import java.util.Scanner;
public class PermanentORTemporary
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter years of Service in Company: ");
		float service = sc.nextFloat();
		
		System.out.println("Enter the Performance Rate: ");
		int rate = sc.nextInt();
		
		if(rate>=0 && rate <=10 )
		{
			if(service >= 3 || rate <= 10)
			{
				System.out.println(name+" is permanent Employee");
			}
			else
			{
				System.out.println(name+ " is Temporary Employee");
			}
		}
		else
		{
			System.out.println("Performance rate is out of range...");
		}
	}
}