package LoginAndLogout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivaraj Attimarad\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins--");
		ChromeDriver driver=new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.get("https://app.edrahi.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,150)");
		driver.findElement(By.xpath("//button[text()='English']")).click();
		driver.findElement(By.id("mobile")).sendKeys("8095176575");
		driver.findElement(By.xpath("//span[text()='Send OTP']")).click();
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("3");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("8");
	    driver.findElement(By.xpath("//span[text()='Verify']")).click();
	    driver.findElement(By.xpath("//span[text()='Notification']")).click();

	}

}
