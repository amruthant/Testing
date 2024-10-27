package assignment1;

public class AreaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaClass c = new AreaClass();
		System.out.println(c.area(9.9));
		System.out.println(c.area(3.6f,7.8f));
		System.out.println(c.area(3));
		
	}
	public double area(double r ) {

		double area = 3.141*r*r;
		
		System.out.println("area of circle");
		return area;
	}
	public float area(float a, float b )
	{
		float area = a*b;
		
		System.out.println("area of rectangle");
		return area;
	}
	public int area(int a )
	{
	 int  area = a*a;
	 System.out.println("area of square");
		return area;
		
	}

}
