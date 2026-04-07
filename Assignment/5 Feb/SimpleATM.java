import java.util.Scanner;
public class SimpleATM
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int balance = 15000;
		int pin = 1234;
		
		System.out.println("***** ATM *****");
		System.out.println("Check Balance: Choice 1" );
		System.out.println("Deposit: Choice 2" );
		System.out.println("WithDraw: Choice 3" );
		System.out.println();
		
		System.out.println("Enter Your Choice: " );
		int choice = sc.nextInt();
		System.out.println();
		
		if(choice == 1)
		{
			System.out.println("Check Balance: " + balance);
		}
		else if(choice == 2)
		{
			System.out.println("Enter Deposit Amount: ");
			int deposit =sc.nextInt();
			balance = balance +deposit;
			System.out.println("Updated Balance: " + balance);
		}
		else if(choice == 3)
		{
			System.out.println("WithDraw Amount: ");
			int withdraw = sc.nextInt();
			
			if(withdraw <= balance)
			{
				balance = balance - withdraw;
				System.out.println("Collect your cash...");
				System.out.println("Remaining Amount: " +balance);
			}
			else
            {
                System.out.println("Insufficient balance");
            }
		}
		else
		{
			System.out.println("Given Choice is out of range");
		}
	}
}