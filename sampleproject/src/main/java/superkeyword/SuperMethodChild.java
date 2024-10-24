package superkeyword;

public class SuperMethodChild extends SuperMethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild c = new SuperMethodChild();
		c.show1();
		
	}
	public void show1() {
		System.out.println("superkeyword method child class");
		super.show();
	}
}
