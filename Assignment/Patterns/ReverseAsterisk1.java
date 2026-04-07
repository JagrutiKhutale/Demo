public class ReverseAsterisk1
{
	public static void main(String[] args)
	{
		for(int line=4;line>=1;line--)
		{
			for(int ast=1;ast<=line;ast++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}