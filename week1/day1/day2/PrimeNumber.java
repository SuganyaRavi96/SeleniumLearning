package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int input=21;
		boolean flag=true;
		for(int i=2; i<=input/2; i++) {
			if(input%i==0) {
			flag=false;
			break;
		}
		}
		if(flag==true) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime");
		}
	}

}
