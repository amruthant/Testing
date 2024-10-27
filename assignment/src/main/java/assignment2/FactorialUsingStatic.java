package assignment2;
public class FactorialUsingStatic {
	static int number;
	static int fact ;
	static int i;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialUsingStatic.factcorialMethod(7);
	}
	public static void factcorialMethod(int a)
	{
		number =a;
		i=1;
	    fact =1;
		
		while(i <=number)
		{
			fact = fact*i;
			i++;
		}
		
	System.out.println("factorial of given number is "+fact);	
		
}
}
