package aggregationassi;

public class StudentChildClass {
	String address;
	StudentParentClass par;//aggregation
	public StudentChildClass(String address ,StudentParentClass par ) {
		this.address = address;
		this.par = par;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentParentClass parent = new StudentParentClass("athira", 20);
		StudentChildClass child = new StudentChildClass("perumbavoor",parent);
		child.display();
	}
public void display() {
	System.out.println("name = "+ par.name + "\n"+ "rollnumuber = "+ par.rollnumber);
	System.out.println("address = "+address);
}
}
