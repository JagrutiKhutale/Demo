public class SandglassPattern
{
	public static void main(String[] args)
	{
		for(int line=1;line<=5;line++)
		{
			for(int space=1;space<= 5-line; space++)
			{
				System.out.print(" ");
			}
			for(int ast=1;ast<= 2*line-1;ast++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int line = 1; line <= 5; line++)
        {
            for(int space = 1; space < line; space++)
            {
                System.out.print(" ");
            }
			for(int ast = line-1; ast <= 2*5 - line ; ast++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
