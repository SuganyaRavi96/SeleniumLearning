package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElementByXPath("//div[@class='x-tab-panel-body x-tab-panel-body-top']//input[@name='firstName']").sendKeys("Suganya");
		driver.findElementByXPath("//button[text()='Find Leads']/ancestor::tbody").click();
		Thread.sleep(3000);

		//input[@id='password']/parent::p

		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[text()='Suganya']").click();

		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.findElementByXPath("//a[text()='Qualify Lead']/following-sibling::a").click();



		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Infoview");
		driver.findElementByXPath("//input[@name='submitButton'][@value='Update']").click();
		String ele=driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		if(ele.contains("Infoview")) {
			System.out.println("verfied");

		}else {
			System.out.println("not verfied");
		}
		driver.close();
	}

}
