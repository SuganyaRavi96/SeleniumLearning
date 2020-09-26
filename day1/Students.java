package week3.day1;

public class Students {
	public void getStudentInfo() {
  System.out.println("default method");
	}
	public void getStudentInfo(int id, String name) {
System.out.println("Student id is : "+id+ "    Student Name is :" + name);
	}
	public void getStudentInfo(String eMail, int phoneNum) {
		System.out.println("email id is :"+eMail+ "   Phone number is : " + phoneNum);
	}
	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentInfo();
		stu.getStudentInfo(10, "Suganya");
		stu.getStudentInfo("xyz@gmail.com", 958741236);
	}
}
