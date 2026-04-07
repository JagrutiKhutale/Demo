import java.util.Scanner;
public class PromotionEligibility
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Experience: ");
		float exp = sc.nextFloat();
		
		System.out.println("Enter Salary: ");
		float salary = sc.nextFloat();
		
		if(exp >= 3 || salary >=50000)
		{
			System.out.println(name+ " is Eligible for Promotion");
		}
		else
		{
			System.out.println(name+ " is not Eligible for Promotion ");
		}
	}
	
}