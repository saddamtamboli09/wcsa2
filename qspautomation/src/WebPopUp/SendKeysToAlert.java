package WebPopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeysToAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(3000);
		driver.findElement(By.id("prompt")).click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.sendKeys("automation");

	}

}
