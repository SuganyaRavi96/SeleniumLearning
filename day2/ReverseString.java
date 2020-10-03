package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";
		String rev="";
		for( int i=test.length()-1;i>=0;i--) {
			rev=rev+test.charAt(i);
		}
		System.out.println("reverse string is :" +rev);
		
		char[] ch=test.toCharArray();

		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
	}

}
