package inherience;

public class SingleChild extends SingleParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild c = new SingleChild();
		c.display();
		c.display2();
	}
	public void display2()
	{
		System.out.println("child classs");
	}

}
