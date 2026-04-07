public class ReverseTriangleStar
{
	public static void main(String[] args)
	{
		for(int line =4; line>=1; line--)
		{
			for(int space=1; space<= 4-line;space++)
			{
				System.out.print(" ");
			}
				for(int ast=1; ast<=line; ast++)
				{
					System.out.print("* ");
				}
			System.out.println();
		}
	}
}