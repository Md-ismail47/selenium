package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class gmail
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		String wh = driver.getWindowHandle();
		driver.findElement(By.xpath("(//a[contains(text(),' Sign')])[2]")).click();
		Set<String> whs = driver.getWindowHandles();
		for(String s:whs)
		{
			if(!s.equals(wh))
			{
				driver.switchTo().window(s);
			}
		}
			driver.findElement(By.id("identifierId")).sendKeys("ismail.mohammed@raagvitech.com",Keys.ENTER);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8749042573@is",Keys.ENTER);
			driver.findElement(By.xpath("(//span[text()='Sandbox: Verify Your Account'])[2]")).click();
			String ss = driver.findElement(By.xpath("(//span[contains(text(),'Enter the following')])[8]")).getText();
			System.out.println(ss);
			String[] str = ss.split(" ");
			System.out.println(str[9]);
	}
}