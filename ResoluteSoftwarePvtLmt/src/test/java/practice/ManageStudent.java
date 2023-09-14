package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ManageStudent {

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
		driver.findElement(By.xpath("//span[text()='Manage Student']")).click();
		driver.findElement(By.xpath("//p[text()='Add student using Form']")).click();
		driver.findElement(By.name("admissionNo")).sendKeys("3AE016");
		driver.findElement(By.name("firstName")).sendKeys("dhanamma");
		driver.findElement(By.name("lastName")).sendKeys("xyz");
		driver.findElement(By.name("fathersName")).sendKeys("KLMN");

        WebElement dropdown = driver.findElement(By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']"));
        Select sel=new Select(dropdown);
		sel.selectByVisibleText("CLASS 1");
		
        driver.close();

	}

}
