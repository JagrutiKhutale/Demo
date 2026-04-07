public class MixedTriangle 
{
	public static void main(String[] args)
	{
		
		
		for(int num=1;num<=6;num++)
		{
			for(int space=1; space<=6-num; space++)
			{
				System.out.print(" ");
			}
				int number=1;
				char ch = 'a';
				for(int chint=1; chint<=num; chint++)
				{
					if(num%2 == 0)
					{
						System.out.print(ch+ " ");
						ch++;
					}
					else
					{
						System.out.print(number+ " ");
						number++;
					}
				}
			System.out.println();
		}
	}
}