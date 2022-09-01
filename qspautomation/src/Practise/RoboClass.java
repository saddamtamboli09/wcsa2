package Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RoboClass
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cleartrip.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath(" c-pointer c-neutral-900")).click();
		Thread.sleep(4000);
		WebElement target =driver.findElement(By.xpath("//h2[@class='fs-6 px-4 c-neutral-400 fw-400']"));
		Actions act =new Actions(driver);
		
		for(int i=0; i<=2; i++)
		{
			act.clickAndHold(target).perform();
		}
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q")).click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		driver.findElement(By.name("btnk")).click();
		
		
		
		
	}
		
}

/*
 1. close the browsers(child+parent) without quit()
 2. Close only the parent window
 3. close only the child window
 4.maximize the child window 
 5 flipkart*/
