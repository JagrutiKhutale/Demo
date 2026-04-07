public class Asterisk
{
	public static void main(String[] args)
	{
		for(int line=1;line<=4; line++)
		{
			for(int ast=1;ast<=line;ast++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}