package abstractionexample;

public class AbstractChild extends AbstractionEx1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild c = new AbstractChild();
		c.add();
		c.display();
		c.display2();
	}
	public void display2() {
		System.out.println("abstract child");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int sum = 2+5;
		System.out.println(sum);
	}
	

}
