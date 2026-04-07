import java.util.Scanner;
public class EmployeeSalary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = sc.next();

        System.out.print("Enter Basic Salary: ");
        int salary = sc.nextInt();

        if (salary >= 15000)
        {
            salary = salary + 2000;   
        }

        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Final Salary  : " + salary);
    }
}
