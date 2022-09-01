package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		Set beforePopup = driver.getWindowHandles();
		driver.findElement(By.xpath("//a[contains(text(),'Open')]")).click();
		Set<String> afterPopup = driver.getWindowHandles();
		afterPopup.removeAll(beforePopup);
		if(afterPopup.size() == 1) 
		{
	          driver.switchTo().window((String)afterPopup.toArray()[0]);
		}
	 
		

	}

}
