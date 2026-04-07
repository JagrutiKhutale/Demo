public class TotalPercentage 
{
	public static void main(String[] Args)
	{
		int sub1 = 90;
		int sub2 = 93;
		int sub3 = 91;
		int sub4 = 93;
		int sub5 = 95;
		
		int total = sub1+sub2+sub3+sub4+sub5;
		float percentage = (total/ 500.0f)*100;
		
		System.out.println("Total Marks: "+total);
		System.out.println("Percentage: "+percentage);
	}
}