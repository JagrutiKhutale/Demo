public class Variable
{
	int insVar=10;
	static char staticVar='H';

public static void main(String[] args)
{
	int i=15;
	float f= 0.8f;
	char c= 'H';
	boolean b= true;
	double d=89.68;
	
	Variable v= new Variable();
	System.out.println("Integer:"+i);
	System.out.println("Float:"+f);
	System.out.println("Character:"+c);
	System.out.println("Boolean:"+b);
	System.out.println("Double:"+d);
	
	System.out.println("Instace Variable:"+v.insVar);
	System.out.println("Static Variable:"+staticVar);
}
}