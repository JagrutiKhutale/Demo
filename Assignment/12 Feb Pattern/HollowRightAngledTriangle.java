public class HollowRightAngledTriangle
{
	public static void main(String[] args)
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				if(row==1 || row==5 || col == 1 || col ==row)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
