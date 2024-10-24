package superkeyword;

public class SuperKeywordChildEx extends SuperVariableEX{

	String colour = "blue";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordChildEx obj = new SuperKeywordChildEx();
		obj.display();
	}
	public void display()
	{
		System.out.println("colour"+colour);
		System.out.println("colour of parent class"+super.colour);
	}

}
