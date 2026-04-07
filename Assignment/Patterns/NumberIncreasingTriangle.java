public class NumberIncreasingTriangle
{
	public static void main(String[] args)
	{
		for(int num1=1;num1<=5;num1++)
		{
			for(int space=1;space<=5-num1;space++)
			{
				System.out.print(" ");
			}
				for(int num2=1;num2<=num1;num2++)
				{
					System.out.print(num2+ " ");
				}
			System.out.println();
		}
	}
}