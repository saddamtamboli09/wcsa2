package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Downloads/loginPage.html");
		
		// how to use id locator
		driver.findElement(By.id("i1")).sendKeys("manager");
		driver.findElement(By.id("i2")).sendKeys("admin123");

	}

}
