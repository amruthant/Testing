package encapsulation;

import java.util.Scanner;

public class ATMClass {
	private int pin ;
	
	
 public void setMethod(int pin) {
	
	 this.pin = pin;
	 /*
	 Scanner s =new Scanner(System.in);
	 System.out.println("enter atm  pin");
	 pin = s.nextInt();*/
	 }
  public void getMethod() {
	 if(pin == 1212 || pin == 1234 || pin ==1001) {
		 System.out.println("valid pin : user can withdraw amount ");
	 }
	 else {
		 System.out.println("invalid pin : user can't withdraw amount ");
	 }
  }
 
 
}
