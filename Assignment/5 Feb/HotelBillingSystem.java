import java.util.Scanner;

public class HotelBillingSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- HOTEL MANAGEMENT BILLING SYSTEM -----");
        System.out.println("1. Tea - Rs. 10");
        System.out.println("2. Coffee - Rs. 20");
        System.out.println("3. Sandwich - Rs. 50");
        System.out.println("4. Meal - Rs. 100");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        int bill = 0;

        if (choice == 1)
        {
            bill = qty * 10;
        }
        else if (choice == 2)
        {
            bill = qty * 20;
        }
        else if (choice == 3)
        {
            bill = qty * 50;
        }
        else if (choice == 4)
        {
            bill = qty * 100;
        }
        else
        {
            System.out.println("Invalid Choice");
        }

        if (bill > 0)
        {
            System.out.println("Total Bill Amount: Rs. " + bill);
        }
    }
}
