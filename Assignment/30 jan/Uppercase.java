import java.util.Scanner;
public class Uppercase
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char character = sc.next().charAt(0);
		
		if(character >= 'A' && character <= 'Z')
		{
			System.out.println("Character is Uppercase");
		}
		else
		{
			System.out.println("Character is not Uppercase");
		}
	}
}