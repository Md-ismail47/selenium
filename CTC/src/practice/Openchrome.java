package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://preprod-questrade.cs123.force.com/BrokersPortal/s/");
//		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("md@test.com");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Qwerty@123");
//		driver.findElement(By.xpath("//button[text()='Login']")).click();
//		String wh1 = driver.getWindowHandle();
//		Robot rbt = new Robot();
//		rbt.keyPress(KeyEvent.VK_CONTROL);
//		rbt.keyPress(KeyEvent.VK_T);
//		rbt.keyRelease(KeyEvent.VK_CONTROL);
//		rbt.keyRelease(KeyEvent.VK_T);
		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
	}
}