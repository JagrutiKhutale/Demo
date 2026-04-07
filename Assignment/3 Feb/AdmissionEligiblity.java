import java.util.Scanner;
public class AdmissionEligiblity
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter the Marks: ");
		float marks=sc.nextFloat();
		
		if(age >= 18 && marks >= 60)
		{
			System.out.println(name+ " is eligible for Admission");
		}
		else
		{
			System.out.println(name+ " is not eligible for Admission");
		}
		
	}
}