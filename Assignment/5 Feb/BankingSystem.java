import java.util.Scanner;

public class BankingSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.println("----- BANKING SYSTEM -----");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1)
        {
            System.out.print("Enter deposit amount: ");
            int amount = sc.nextInt();

            balance = balance + amount;
            System.out.println("Amount Deposited Successfully");
            System.out.println("Current Balance: " + balance);
        }
        else if (choice == 2)
        {
            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            if (amount <= balance)
            {
                balance = balance - amount;
                System.out.println("Please collect your cash");
                System.out.println("Current Balance: " + balance);
            }
            else
            {
                System.out.println("Insufficient Balance");
            }
        }
        else if (choice == 3)
        {
            System.out.println("Your Balance: " + balance);
        }
        else
        {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
