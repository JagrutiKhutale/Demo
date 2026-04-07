public class ButterFlyPattern
{
	public static void main(String[] args)
	{
		//left side up
		for(int line=1;line<=5;line++)
		{
			for(int ast=1;ast<=line;ast++)
			{
				System.out.print("*");
			}
			for(int space=1;space<=2*(5-line);space++)
			{
				System.out.print(" ");
			}
			for(int ast=1;ast<=line;ast++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int line = 4; line >= 1; line--)
        {
            for(int ast = 1; ast <= line; ast++)
			{
				System.out.print("*");
			}
			for(int space = 1; space <= 2*(5-line); space++)
			{
				System.out.print(" ");
			}
			for(int ast = 1; ast <= line; ast++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}