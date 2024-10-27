package assignment3;


public class ReverseClass {

	int sum =0;
	int reminder =0;
	int number =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseClass re =new ReverseClass();
	}
	public ReverseClass(int number) {
		
		this.number =number;
	
	    while(number>0) {
		reminder = number%10;
		sum = sum*10+ reminder;
		number = number/10;
		}
	//System.out.println(sum);
	}
	public ReverseClass() {
		this(212);
	
	System.out.println("reverse number ="+sum);
	}
	

}
