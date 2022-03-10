package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackToParentFrame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("firstFr");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"has-background-white\"]")));

		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abc@gmail.com");
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.name("fname")).sendKeys("Vieky");

		Thread.sleep(4000);
		driver.close();

	}

}
