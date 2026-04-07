import java.util.Scanner;
public class RailwayTicketBooking
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- RAILWAY TICKET BOOKING -----");
		System.out.println("Sleeper class - 300 ");
		System.out.println("AC class - 1000 ");
		System.out.println("First class - 1500 ");
		System.out.println();
		
		System.out.println("Enter your Choice: ");
		int choice = sc.nextInt();
		
		System.out.println("Enter number of ticket: ");
		int ticket = sc.nextInt();
		
		int total, discount = 0;
		if(choice == 1)
		{
			total = 300 * ticket;
			System.out.println("Class: Sleeper Class");
		}
		else if(choice == 2)
		{
			total = 1000 * ticket;
			System.out.println("Class: AC Class");
		}
		else if(choice == 3)
		{
			total = 1500 * ticket;
			System.out.println("Class: First Class");
		}
		else
		{
			System.out.println("Invalid class choice");
			return;
		}
		
		if(total >= 4000)
		{
			discount = total * 10/100;
		}
		 int finalAmount = total - discount;
		 System.out.println("Discount: Rs." + discount);
		 System.out.println("Final Amount to Pay: Rs." + finalAmount);
	}
}