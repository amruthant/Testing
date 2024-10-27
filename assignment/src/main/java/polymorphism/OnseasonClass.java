package polymorphism;

public class OnseasonClass extends OffseasonClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnseasonClass s = new OnseasonClass();
		s.discountMethod(2000);
	}
	public void discountMethod(double price) {
		double discount = 0.4*price;
		System.out.println(discount);
		System.out.println("40% discount");
		super.discountMethod(3000);
	}

}
