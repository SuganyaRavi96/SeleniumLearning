package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int first=0;
 int second=1;
 System.out.print(first+" "+second+" ");
 for(int i=0;i<20;i++) {
 int third =first+second;
 System.out.print(third+" ");
 first=second; 
 second=third;
		
 }
	}

}
