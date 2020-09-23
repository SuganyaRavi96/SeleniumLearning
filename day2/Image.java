package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElementByXPath("//label[@for='home']/following-sibling::img").click();
		driver.navigate().to("http://leafground.com/pages/Image.html");
		WebElement ele	=driver.findElementByXPath("//label[@for='position']/following-sibling::img");
		if(ele.getAttribute("naturalWidth").equals("0")) {
			 System.out.println("broken image");
		}else {
			System.out.println("image is not broken");
		}
		Thread.sleep(1000);
//		driver.findElementByXPath("//img[@src='../images/keyboard.png']").sendKeys(Keys.F5);
		
	}

}
