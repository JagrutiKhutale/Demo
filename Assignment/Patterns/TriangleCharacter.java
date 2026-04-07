public class TriangleCharacter
{
	public static void main(String[] args)
	{
		for(int line=1;line<=5;line++)
		{
			for(int space=1;space<=5-line;space++)
			{
				System.out.print(" ");
			}
				char ch= 'a';
				for(int ch1=1;ch1<=line; ch1++)
				{
					System.out.print(ch+ " ");
					ch++;
				}
			System.out.println();
		}
	}
}