//write aprgm to check whether the customer have discount)get 20& if total amount is greater that 5000)or not and get the final amount in main method (static method)
package assignment2;
public class DiscountClassEx {
	static double totalamount;
	static double finalamount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    checkPriceMethod(3000,3000);
    checkDiscountMethod();
	}
public static void checkPriceMethod(int p1, int p2)
{
	totalamount = p1+p2;
	}
public static void checkDiscountMethod()
{
	if(totalamount>5000)
	{
		finalamount = totalamount*0.2;
		System.out.println("finalamount is with 20% discount "+finalamount);
	}
	else {
		System.out.println("no discount ");
	}
	}
}
