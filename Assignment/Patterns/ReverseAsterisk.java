public class ReverseAsterisk
{
	public static void main(String[] args)
	{
		for(int line=1;line<=4;line++)
		{
			for(int ast=4;ast>=line;ast--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}