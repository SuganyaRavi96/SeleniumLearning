package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=327;
		int orginal=input;
		int sum=0;
		int rem;
		while(input>0) {
			rem=input%10;
			sum=sum+(rem*rem*rem);
			input=input/10;
		}
		if(sum==orginal) {
			System.out.println("Armstrong Number is :"+sum);	
		}else {
			System.out.println("value entered is not armstrong number:"+sum);
		}

	}

}
