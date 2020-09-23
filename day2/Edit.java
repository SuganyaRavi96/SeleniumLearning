package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElementByXPath("//input[@id='email']").sendKeys("sugi@gmail.com");
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("value"+Keys.TAB);
		String element=	driver.findElementByXPath("//input[@value='TestLeaf']").getText();
		System.out.println(element);
		
		WebElement clearEle=driver.findElementByXPath("//input[@value='Clear me!!']");
				clearEle.clear();
		clearEle.sendKeys("I am new");
		
		Boolean value=driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		System.out.println(value);
		driver.close();
	}
	
}
