import java.util.Scanner;
public class TeenageCheck
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Age:");
		int age =sc.nextInt();
		
		if(age>0 & age<=13)
		{
			System.out.println(name+ " is a Child");
		}
		else if(age<13 || age<=17)
		{
			System.out.println(name+ " is a Teenager");
		}
		else if(age<17 || age<60)
		{
			System.out.println(name+ " is Adult");
		}
		else
		{
			System.out.println(name+ " is a Senior citizen");
		}
	}
}
