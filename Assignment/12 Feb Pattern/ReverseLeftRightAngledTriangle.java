public class ReverseLeftRightAngledTriangle
{
	public static void main(String[] args)
	{
		for(int line=0;line<=5;line++)
		{
			for(int ast=1;ast<=5-line;ast++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}