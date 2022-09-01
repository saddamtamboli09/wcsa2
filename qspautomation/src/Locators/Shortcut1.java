package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shortcut1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.cssSelector("input[id^='txtU']")).sendKeys("admin"); // matches the starting character 
		/* if we don't want to pass the complete
		value for the attribute this shortcut can be used 
		where the cssSelector matches the starting the character */ 

	}

}
