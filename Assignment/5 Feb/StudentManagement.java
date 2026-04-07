import java.util.Scanner;

public class StudentManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- STUDENT MANAGEMENT SYSTEM -----");
        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        System.out.println("3. Check Result");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // Student data (basic)
        int rollNo = 101;
        String name = "Jagruti";
        int marks = 72;

        if (choice == 1)
        {
            System.out.println("Student Added Successfully");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
        }
        else if (choice == 2)
        {
            System.out.println("----- Student Details -----");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
        }
        else if (choice == 3)
        {
            if (marks >= 35)
                System.out.println("Result: Pass");
            else
                System.out.println("Result: Fail");
        }
        else
        {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
