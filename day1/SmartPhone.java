package week3.day1;

public class SmartPhone  extends AndroidPhone {
	public void connectWhatsApp() {
		System.out.println("connected whatsspp");
	}
	public void takeVideo() {
	       System.out.println(" take video");
		}
	
	public static void main(String[] args) {
		SmartPhone sp=new SmartPhone();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
		sp.takeVideo();
		sp.connectWhatsApp();
	}
}
