package inheritenceAssignment;

public class ClassB extends ClassA{
	double hra;
	double pf;
	 public void calculateMethod() {
		 hra = 0.05*this.basicpay;
		 pf  =  0.2*this.basicpay;
	 }

}
