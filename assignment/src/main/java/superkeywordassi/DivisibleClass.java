package superkeywordassi;

public class DivisibleClass extends AdditionClass{
  double result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisibleClass v = new  DivisibleClass();
		v.divisiblecheck();
	}
	
public void divisiblecheck () {
	result = super.add(12, 23);
	double div = result%10;
	if(div == 0) {
		System.out.println("divisible by 10");
	}
	else {
		System.out.println("not divisible by 10");
	}
}
}
