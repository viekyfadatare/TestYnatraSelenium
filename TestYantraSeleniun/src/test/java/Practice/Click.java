package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		WebElement gmail = driver.findElement(By.xpath("//div[@class=\"gb_Td gb_Va gb_Id\"]/descendant::a[@class=\"gb_d\" and @data-pid=\"23\"]"));
		
		//gmail.click();
		
	//	gmail.sendKeys(Keys.ENTER);
		
		/*JavascriptExecutor js = (JavascriptExecutor)driver; 
	    js.executeScript("arguments[0].click();", gmail);*/  
		
		/*Actions actions = new Actions(driver);  
	    actions.click(gmail).perform();*/
		
		WebElement txt = driver.findElement(By.xpath("//div[@class=\"RNNXgb\"]/descendant::input"));
	
		//txt.sendKeys("dhanajay");
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;

		 JS.executeScript("arguments[0].value='dhanajay';", txt);		

	}

}
