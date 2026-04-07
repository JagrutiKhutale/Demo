import java.util.Scanner;
public class EmptyString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		if(str.isEmpty())
		{
			System.out.println("String is Empty");
		}
		else
		{
			System.out.println("String is Full");
		}
	}
}