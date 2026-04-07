import java.util.Scanner;
public class ValidatePassword
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Password: ");
		String str = sc.nextLine();
		
		if(str.length() >= 8)
		{
			if(str.contains("@") || str.contains("#") || str.contains("$"))
			{
				System.out.println("Valid Password");
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		else
		{
			System.out.println("Invalid Password");
		}
	}
}