import java.util.Scanner;
public class OnlineShopping
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("----- ONLINE SHOPPING MENU -----");
        System.out.println("1. Mobile  - Rs.15000");
        System.out.println("2. Laptop  - Rs.50000");
        System.out.println("3. Headphones - Rs.2000");
        System.out.println("4. Smart Watch - Rs.3000");
		System.out.println();
		
        System.out.print("Enter product choice: ");
        int choice = sc.nextInt();
		
		int price = 0;
		
		if(choice ==1 )
		{
			price = 15000;
		}
		else if(choice == 2)
		{
			price = 50000;
		}
		else if(choice == 3)
		{
			price = 2000;
		}
		else if(choice == 4)
		{
			price = 3000;
		}
		else{
			System.out.println("Product in out of Menu...");
			return;
		}
		System.out.println("Enter Quantity: ");
		int quantity = sc.nextInt();
		
		int total = price*quantity;
		
		if (total >= 50000)
		{
			total = total - 5000;
			System.out.println("Discount applied: Rs.5000");
		}			
		System.out.println("Total amount to pay: Rs." + total);
        System.out.println("Thank you for shopping!");
	}
}