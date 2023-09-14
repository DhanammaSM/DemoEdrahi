package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UpdateAndEditManageLicence {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivaraj Attimarad\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins--");
		ChromeDriver driver=new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.get("https://facegenie-ams-school.web.app/"); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("testbams@gmail.com");
		driver.findElement(By.id("password")).sendKeys("facegenie");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//span[text()='Manage Licenses']")).click();
		driver.findElement(By.xpath("//p[text()='Add License']")).click();
		driver.findElement(By.name("empId")).sendKeys("EMP_01");
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,900)");
		driver.findElement(By.xpath("//button[text()='12344']")).click();
		driver.findElement(By.xpath("//p[text()='Edit Details']")).click();
		
		JavascriptExecutor jse1= (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//p[text()='Update License']")).click();
		
		driver.close();

	}

}
