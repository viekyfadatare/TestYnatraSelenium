package Practice;

import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameJawala {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
		 driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs ']/descendant::a[contains(.,'Iframe with in an Iframe')]")).click();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(frame1);
	 
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\" and @style=\"float: left;height: 250px;width: 400px\"]"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.tagName("input")).sendKeys("dabbu");
		
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//a[contains(.,'WebTable')]")).click();
		
		/*driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(.,'Single Iframe ')]")).click();
		
		driver.switchTo().frame(frame2);

		driver.findElement(By.tagName("input")).sendKeys("shailendra");*/
		
		/*driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).sendKeys("Shailendra");*/

		
		}
		
		
		finally {
			
			Thread.sleep(4000);
			driver.close();

		}
		
	

		

	}

}
