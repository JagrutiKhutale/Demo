public class RightPascalTriangle
{
	public static void main(String [] args)
	{
		for(int ast=1;ast<=4;ast++)
		{
			for(int line=1; line<=ast; line++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int ast=4-1;ast>=1;ast--)
		{
			for(int line=1;line<=ast;line++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}