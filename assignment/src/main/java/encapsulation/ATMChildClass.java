package encapsulation;

import java.util.Scanner;

public class ATMChildClass extends ATMClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMChildClass c = new ATMChildClass();
		 Scanner s =new Scanner(System.in);
		 System.out.println("enter atm  pin");
		int pin = s.nextInt();
		c.setMethod(pin);
		c.getMethod();
	}

}
