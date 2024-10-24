package agregation;

public class AgregationEx2 {
	int rollnumber;
	String city;
	AgregationEX1  ref;//aggregation
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgregationEX1 obj = new AgregationEX1("PERUM",12);
		AgregationEx2 obj2 = new AgregationEx2(12,"ekm",obj);
		obj2.display();
	}
	
	public AgregationEx2(int rollnumber ,String city, AgregationEX1  ref) {
		this.rollnumber = rollnumber;
		this.city = city;
		this.ref =ref;
	}
		
	
	public void display()
	{
		System.out.println(ref.name + ref.age);
		System.out.println(rollnumber + city);
	}

}
