package week1.day1;

public class Mobile {
	long mobileNum =1234567890l;
	String mobileColor= "white";
	 double mobileWeight =2.5;
	 Boolean isReburished= false;
	 int a=5;
	
	public void makeCall() {
		System.out.println("call waiting");

	}
     public void sendMessage() {
		System.out.println("message sent");
	}
  public void takePhoto() {
	  System.out.println("selfie");
  }
  
  public static void main(String[] args) {
	Mobile mobile = new Mobile();
	mobile.makeCall();
	mobile.sendMessage();
	mobile.takePhoto();
	System.out.println(mobile.mobileNum);
	System.out.println(mobile.mobileColor);
	System.out.println(mobile.mobileWeight);
	System.out.println(mobile.isReburished);
}
}
