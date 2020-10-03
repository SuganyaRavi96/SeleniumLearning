package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss"; 
		

		if(text1.length()==text2.length()){
			char[] ch1=text1.toCharArray();
			char[] ch2=text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			System.out.println(ch1);
			System.out.println(ch2);
		}

	}

}
