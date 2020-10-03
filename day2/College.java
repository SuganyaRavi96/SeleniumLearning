package week3.day2;

public class College extends University {

	public static void main(String[] args) {
		College c= new College();
		c.ug();
		c.pg();
	}

	@Override
	public void ug() {
		System.out.println("Execute UG");		
	}

}
