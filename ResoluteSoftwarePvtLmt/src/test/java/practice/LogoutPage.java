package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LogoutPage {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivaraj Attimarad\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins--");
		ChromeDriver driver=new ChromeDriver(option);

		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://facegenie-ams-school.web.app/"); 
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("testbams@gmail.com");
		driver.findElement(By.id("password")).sendKeys("facegenie");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		Thread.sleep(15000);
	  driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	  driver.switchTo().alert().accept();
	 driver.close();
	}

}
