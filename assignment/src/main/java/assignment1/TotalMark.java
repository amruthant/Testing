package assignment1;

public class TotalMark {
	
	int totalmark =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalMark mark = new TotalMark(23,20,30);
		mark.display();
		TotalMark mark2 = new TotalMark(20,20,30);
		mark2.display();
	}
	public TotalMark(int a, int b, int c ){
		totalmark  = a+b+c;
		System.out.println(totalmark);
	}
	public void display() {
		if (totalmark <45) {
			System.out.println("fail");
		}
		else if(totalmark >=45 && totalmark <=50 )
		{
			System.out.println("D");
		}
		
		else if(totalmark >=51 && totalmark <=60)
		{
			System.out.println("D+");
		}
		else if(totalmark >=61 && totalmark <=70 )
		{
			System.out.println("B");
		}
		else if(totalmark >=71 && totalmark <=80 )
		{
			System.out.println("B+");
		}
		else if(totalmark >=81 && totalmark <=90 )
		{
			System.out.println("a");
		}
		else if(totalmark >=91 && totalmark <=100 )
		{
			System.out.println("A+");
		}
	}

}
