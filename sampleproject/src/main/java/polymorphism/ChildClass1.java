package polymorphism;

public class ChildClass1 extends  ParentClass1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass1 child = new ChildClass1();
		child.display(5, 6);
	}
	public void display( int a, int b) {
		int s = a-b;
		System.out.println(s);
		super.display(6, 7);//polymorphism
	}

}
