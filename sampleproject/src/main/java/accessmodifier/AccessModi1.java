package accessmodifier;

public class AccessModi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModi1 obj = new AccessModi1();
		obj.display();
		obj.display2();
		obj.display3();
		obj.display4();
	}
	public void display() {
		System.out.println(" public access modifier");
	}
	
	private void display2() {
		System.out.println("private access modifier");
	}
	
	protected void display3() {
		System.out.println("protected access modifier");
	}
	 void display4() {
		System.out.println("default  access modifier");
	}
	

}
