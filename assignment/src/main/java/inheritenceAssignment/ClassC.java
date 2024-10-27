package inheritenceAssignment;

public class ClassC extends ClassB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ClassC s = new ClassC();
   s.setSalraryDetails(100000, 10000, 3000);
   s.calculateMethod();
   s.salarySlipDetails();
	}
	public void salarySlipDetails() {
		double inhandsalary = super.basicpay + super.bonus + super.hra -(super.pf + super.deduction);
		System.out.println("basicpay = " +  super.basicpay +"  bonus = "+ super.bonus +"  hra = "+ super.hra +"  pf  ="+ super.pf +" deduction ="+ super.deduction);
		System.out.println("inhand bdsalary  "+inhandsalary);
	}

}
