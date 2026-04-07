public class HollowTriangleWithNumber
{
	public static void main(String[] args)
	{
		for(int row=1;row<=9;row++)
		{
			for(int space=1; space<=9-row;space++)
			{
				System.out.print(" ");
			}
			for(int number=1;number<=row;number++)
			{
				if(number == 1 || number== row || row==9)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(number+ " ");
				}
				
			}
			System.out.println();
		}
	}
}