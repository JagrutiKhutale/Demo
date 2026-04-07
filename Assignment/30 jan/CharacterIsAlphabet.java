import java.util.Scanner;
public class CharacterIsAlphabet
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char character = sc.next().charAt(0);
		
		if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
		{
			System.out.println("Character is Alphabet");
		}
		else
		{
			System.out.println("Character is not Alphabet");
		}
	}
}