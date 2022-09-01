package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// Xpath using unique attribute
		// this can be used for unique attribute such id, name, title, value, placeholder
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		
		

	}

}
