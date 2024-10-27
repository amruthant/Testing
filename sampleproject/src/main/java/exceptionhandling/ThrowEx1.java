package exceptionhandling;

public class ThrowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age =20;
if(age>=18) {
	System.out.println("eligible for voting");
}else {
	throw new ArithmeticException("age under 18");
}
	}

}
