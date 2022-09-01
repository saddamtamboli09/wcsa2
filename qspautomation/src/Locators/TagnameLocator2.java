package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLocator2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/HTML%20S/loginPage.html");
		
		// how to use tagname locator
		driver.findElement(By.tagName("input")).sendKeys("krutika");
		

	}

}
