package MethodsofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/HTML%20S/checkbox.html");
		String sourceCodehtml = driver.getPageSource();
		System.out.println(sourceCodehtml);

	}

}
