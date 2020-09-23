package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[text()='Phone']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("87");
		driver.findElementByXPath("//button[text()='Find Leads']/ancestor::tbody").click();
		Thread.sleep(2000);
		String ele=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		System.out.println(ele);
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Edit']/following-sibling::a").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//div[@class='x-form-element']/input[@name='id']").sendKeys("10378");
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Find Leads']/ancestor::tbody").click();
		Thread.sleep(2000);
		String returnStr=driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		if(returnStr.contains("No records to display")) {
			System.out.println("successful deletion");
		}else {
			System.out.println("delete operation is not perfomed");
		}
		driver.close();
	}

}
