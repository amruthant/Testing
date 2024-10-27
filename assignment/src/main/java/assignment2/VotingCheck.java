//write aprogram to check whether candidate is eligible for voting(use static method and boolean return type)
package assignment2;
public class VotingCheck {
	static int age ;
	static boolean flag ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    checkVoting(false);
	}
	 public static boolean checkVoting(boolean a) {
		 flag =a;
		 if(a==true)
		 {
			 System.out.println("eligible for voting");
		 }
		 else {
			 System.out.println("not eligible for voting"); 
		 }
		
		return flag;
	}
	}
