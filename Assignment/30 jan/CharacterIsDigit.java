import java.util.Scanner;
public class CharacterIsDigit
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char character = sc.next().charAt(0);
		
		if(character >= '0' && character <= '9')
		{
			System.out.println("Character is Digit");
		}
		else
		{
			System.out.println("Character is not Digit");
		}
	}
}
		