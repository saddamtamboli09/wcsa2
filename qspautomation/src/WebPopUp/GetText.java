package WebPopUp;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/HTML%20S/confirmation.html");
		driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		String text = al.getText();
		System.out.println(text);
		
		
	
		
		

	}

}
