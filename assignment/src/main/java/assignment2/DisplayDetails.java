//write a program to set your age and name and display using another method(static method)
package assignment2;

public class DisplayDetails {
	static String name;
	static int age ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayDetails.Details(12, "ashna");
		DisplayDetails.displayDetails1();
		
	}
	public static void Details(int a , String b)
	{
		name =b;
		age =a;
		
		}
	public static void displayDetails1()
	{
		System.out.println("age is " +age +"\n" + "name is "+name);
		
		}

}
