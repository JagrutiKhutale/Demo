public class OddStarPattern
{
	public static void main(String[] args)
	{
		for(int line=1;line<=9;line++)
		{
			for(int ast=0; ast<=2*(line-1) ; ast++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}