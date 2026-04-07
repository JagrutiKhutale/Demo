import java.util.Scanner;

public class ResultProcessing
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks of Subject 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks of Subject 3: ");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        float percentage = total / 3.0f;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if (sub1 < 35 || sub2 < 35 || sub3 < 35)
        {
            System.out.println("Result: Fail");
        }
        else if (percentage >= 75)
        {
            System.out.println("Result: Distinction");
        }
        else if (percentage >= 60)
        {
            System.out.println("Result: First Class");
        }
        else if (percentage >= 50)
        {
            System.out.println("Result: Second Class");
        }
        else if (percentage >= 35)
        {
            System.out.println("Result: Pass");
        }
        else
        {
            System.out.println("Result: Fail");
        }
		System.out.println();
    }
}
