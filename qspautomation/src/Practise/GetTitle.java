package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/profile?application_source=Organic&apop=my-profile");
		String titleofwebpage = driver.getTitle();
		System.out.println(titleofwebpage);

	}

}
