import java.util.Scanner;
public class TwoEqualNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int num1= sc.nextInt();
		
		System.out.println("Enter 2nd Number: ");
		int num2=sc.nextInt();
		
		if(num1==num2)
		{
			System.out.println("Number are Equal...");
		}
		else
		{
			System.out.println("Number are not Equal...");
			
		}
	}
}