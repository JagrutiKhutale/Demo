public class SwapNumber
{
public static void main(String[] Args)
{
	int a= 10;
	int b= 5;
	int temp;
	
	System.out.println("Before Swapping");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	
	temp=a;
	a=b;
	b=temp;
	
	System.out.println("After Swapping");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
}
}