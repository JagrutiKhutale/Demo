import java.util.Scanner;
public class palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		int rev=0,temp=num;
		while(num>0)
		{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(temp == rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
