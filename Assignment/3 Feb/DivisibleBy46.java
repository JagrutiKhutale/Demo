import java.util.Scanner;
public class DivisibleBy46
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		if(num%4 == 0)
		{
			System.out.println("Divisible by 4");
		}
		if(num%6 == 0)
		{
			System.out.println("Divisible by 6");
		}
		if(num%4 != 0 && num%6 != 0 )
		{
			System.out.println("Not divisible by 4 & 6");
		}
	}
}