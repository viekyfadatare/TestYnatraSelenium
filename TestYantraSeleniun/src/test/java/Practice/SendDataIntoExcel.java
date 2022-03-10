package Practice;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SendDataIntoExcel {
	////div[@class="col col-5-12 nlI3QM"]/descendant::div[@class="_30jeq3 _1_WHN1"]
	
	@Test
	public void testCase1() {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//div[@class='_1cmsER']/descendant::input[@class='_3704LK']")).sendKeys("Vivo mobile", Keys.ENTER);
		
		driver.findElements(By.xpath("div[@class=\"col col-5-12 nlI3QM\"]/descendant::div[@class=\"_30jeq3 _1_WHN1\"]"));
		
		
	}

}
