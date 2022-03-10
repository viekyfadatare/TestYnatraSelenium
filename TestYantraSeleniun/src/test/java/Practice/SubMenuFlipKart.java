package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SubMenuFlipKart {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		Thread.sleep(1000);
		close.click();
		
		Actions a = new Actions(driver);
		
		List<WebElement> menu = driver.findElements(By.xpath("//div[@class='_37M3Pb']"));
		
		for (WebElement submenu : menu) {
			
			String name = submenu.getText();
			System.err.println(name);
			
			Thread.sleep(1000);
			a.moveToElement(submenu).perform();
			
			Thread.sleep(2000);
			
			List<WebElement> sub = driver.findElements
				(By.xpath("//div[contains(.,'"+ name +"')]/parent::a/descendant::div[@class='_2IjXr8']/div/a"));
			for (WebElement subname : sub) {
				
				System.out.println(subname.getText());
			}
			
			
		}
		
		
	

	}

}
