package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LIstOfWebElementInFlipKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(10000);

		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();

		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("RealMe");

		driver.findElement(By.xpath("//div[@class=\"_1cmsER\"]/descendant::button[@class=\"L0Z3Pu\"]")).click();

		List<WebElement> lst = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));

		lst.get(12).click();
	}

}
