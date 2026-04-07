import java.util.Scanner;
public class ThreeEqualNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int num1= sc.nextInt();
		
		System.out.println("Enter 2nd Number: ");
		int num2=sc.nextInt();
		
		System.out.println("Enter 3rd Number: ");
		int num3=sc.nextInt();
		
		if(num1 == num2 && num2 == num3)
		{
			System.out.println("Numbers are Equal");
		}
		else if(num1 == num2)
		{
			System.out.println("First and Second Number are Equal");
		}
		else if(num2 == num3)
		{
			System.out.println("Second and Third Number are Equal");
		}
		else if(num1 == num3)
		{
			System.out.println("First and Third Number are Equal");
		}
		else
		{
			System.out.println("Numbers are not Equal");
		}
	}
}