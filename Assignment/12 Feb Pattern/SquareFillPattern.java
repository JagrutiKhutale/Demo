import java.util.Scanner;
public class SquareFillPattern
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		
		for(int line= 0;line< size; line++)
		{
			for(int ast= 0;ast<size;ast++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}