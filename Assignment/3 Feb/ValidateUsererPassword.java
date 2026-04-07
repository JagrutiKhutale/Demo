import java.util.Scanner;
public class ValidateUsererPassword 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username:");
        String uname = sc.nextLine();

        System.out.println("Enter Password:");
        String pass = sc.nextLine();

        if (uname.length() >= 10) 
		{
            if (pass.length() >= 8) 
			{
                if (pass.contains("@") || pass.contains("#") || pass.contains("$")) 
				{
                    System.out.println("Username and Password are Valid");
                } 
				else 
				{
                    System.out.println("Invalid Password");
                }
            } 
			else 
			{
                System.out.println("Invalid Password");
            }
        } 
		else
		{
            System.out.println("Invalid Username");
        }
    }
}
