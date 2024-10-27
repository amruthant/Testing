package assignment3;
public class FactorialClass {
int number =0;
int sum =1;
int i=1;
public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		FactorialClass fact = new FactorialClass();
		fact.factcorialMethod();
	}
	
	public int factcorialMethod(int a)
	{
		number =a;
		
		while(i <=number)
		{
			sum = sum*i;
			i++;
		}
		
		return sum;
		
}
	public void factcorialMethod()
	{
		this.factcorialMethod(7);
		System.out.println("facrorial="+sum);
		
	}
	
}
