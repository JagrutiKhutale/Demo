public class DaysConversion 
{
	public static void main(String[] Args)
	{
		int totalDays=600;
		
		int years,weeks,days;
		
		years= totalDays/365;
		int remainingDays = totalDays %365;
		
		weeks=remainingDays/7;
		days= remainingDays %7;
		System.out.println("Years: "+years);
		System.out.println("Weeks: "+weeks);
		System.out.println("Days: "+days);
	}
}