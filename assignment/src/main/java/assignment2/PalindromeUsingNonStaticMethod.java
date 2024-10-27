//write aprogram to check the given number is palindrome not using static method
package assignment2;
public class PalindromeUsingNonStaticMethod {
	 int sum =0;
	 int reminder =0;
	 int number =0;
	 int temp =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeUsingNonStaticMethod pal = new PalindromeUsingNonStaticMethod();
		pal.reverseMethod(212);
		pal.displayPalindrome();
	}
public  void reverseMethod(int a) {
	number=a;
    temp = number;
	
	    while(number>0) {
		reminder = number%10;
		sum = sum*10+ reminder;
		number = number/10;
		}
	
	}
	public  void displayPalindrome() {
		
	if(sum==temp)
	{
		System.out.println("the given number is palindome"+sum);
	}
	else {
	System.out.println("not palindrome");
	}
	}
}
