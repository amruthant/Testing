package assignment1;

public class AverageClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageClass obj =new AverageClass();
	System.out.println("average = "+obj.average(0.9f, 8.1f, 1.2f));	
	//obj.average(0.9f, 8.1f, 1.2f);
	}
public int average(int a, int b,int c ) {

	int sum =(a+b+c)/3;
	return sum;
	
}
public float average(float a, float b,float c )
{
	float sum =(a+b+c)/3;
	return sum;
	
}
}
