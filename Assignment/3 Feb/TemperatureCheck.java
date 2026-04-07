import java.util.Scanner;
public class TemperatureCheck 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature: ");
		int temp = sc.nextInt();
		int cel = (temp-32)*5/9;
		System.out.println("Celsius "+cel);
		if(cel < 15)
		{
			System.out.println("Temperature is Cold");
		}
		else if(cel <= 30)
		{
			System.out.println("Temperature is Normal");
		}
		else
		{
			System.out.println("Temperature is Hot");
		}
	}
}