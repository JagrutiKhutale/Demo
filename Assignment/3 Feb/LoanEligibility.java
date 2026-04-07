import java.util.Scanner;
public class LoanEligibility
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Salary: ");
		float salary = sc.nextFloat();
		
		if(salary>=30000)
		{
			System.out.println(name+ " is eligible for Loan");
		}
		else
		{
			System.out.println(name+ " is not eligible for Loan");
		}
	}
}