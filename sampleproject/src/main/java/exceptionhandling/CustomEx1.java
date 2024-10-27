package exceptionhandling;

public class CustomEx1 {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age =5;
		if(age>=18) {
			System.out.println("eligible for voting");
		}else {
			throw new VotingException("age under 18");
			
		}
			}
	}


