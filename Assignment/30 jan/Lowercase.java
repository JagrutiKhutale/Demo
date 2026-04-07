import java.util.Scanner;
public class Lowercase
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char character = sc.next().charAt(0);
		
		if(character >= 'a' && character <= 'z')
		{
			System.out.println("Character is Lowercase");
		}
		else
		{
			System.out.println("Character is not Lowercase");
		}
	}
}