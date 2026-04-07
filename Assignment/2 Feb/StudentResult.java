import java.util.Scanner;
public class StudentResult 
{
	public static void main(String[] Args)
	{
		Scanner sc=new Scanner(System.in);
		int sub1,sub2,sub3,sub4,sub5;
		int total;
		float percentage;
		
		System.out.println("Enter the marks of 1st Subject: ");
		sub1= sc.nextInt();
		
		System.out.println("Enter the marks 2nd Subject: ");
		sub2=sc.nextInt();
		
		System.out.println("Enter the marks 3rd Subject: ");
		sub3=sc.nextInt();
		
		System.out.println("Enter the marks 4th Subject: ");
		sub4=sc.nextInt();
		
		System.out.println("Enter the marks 5th Subject: ");
		sub5=sc.nextInt();
		
		total= sub1+sub2+sub3+sub4+sub5;
		percentage=total/5.0f;
		
		System.out.println("Total: "+total);
		System.out.println("Percentage: "+percentage+ "%");
		
		if(percentage>=75)
		{
			System.out.println("Grade: Distinction");
		}
		else if(percentage>60)
		{
			System.out.println("Grade: First Class");
		}
		else if(percentage>50)
		{
			System.out.println("Grade: Second Class");
		}
		else if(percentage>=35)
		{
			System.out.println("Grade: Pass");
		}
		else
		{
			System.out.println("Grade: Fail");
		}
		
	}
}