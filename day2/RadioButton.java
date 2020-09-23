package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leafground.com/pages/radio.html");
			driver.findElementByXPath("//label[@for='yes']/input").click();
			Boolean select=driver.findElementByXPath("//label[@for='Checked']/input").isSelected();
			System.out.println(select);
			Boolean select1=driver.findElementByXPath("//div[@class='large-6 small-12 columns']//input[2]").isSelected();
			System.out.println(select1);
		}

	}


