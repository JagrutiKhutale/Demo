import java.util.Scanner;

public class OnlineExamEvaluation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int totalMarks = 0;

        System.out.println("----- ONLINE EXAM EVALUATION SYSTEM -----");

        System.out.print("Enter marks for Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int sub3 = sc.nextInt();

        totalMarks = sub1 + sub2 + sub3;
        float percentage = totalMarks / 3.0f;

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 70)
        {
            System.out.println("Result: Distinction");
        }
        else if (percentage >= 60)
        {
            System.out.println("Result: First Class");
        }
        else if (percentage >= 35)
        {
            System.out.println("Result: Pass");
        }
        else
        {
            System.out.println("Result: Fail");
        }
    }
}
