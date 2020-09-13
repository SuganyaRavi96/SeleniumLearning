package week1.day1;

public class OddNumber {
public static void main(String arg[]) {
	System.out.println("printing only odd numbers from 1 to 20");
	int n = 100;
	System.out.print("Odd Numbers from 1 to "+n+" are: ");
	for (int i = 1; i <= n; i++) {
	   if (i % 2 != 0) {
		System.out.print(i + " ");
	   }
	}
}

}
