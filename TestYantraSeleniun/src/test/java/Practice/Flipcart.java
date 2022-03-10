package Practice;
import java.sql.DriverManager;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.collect.Sets;
import com.mysql.jdbc.Driver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
     
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		ele.sendKeys("redmi");
	LinkedHashSet<String> s=new LinkedHashSet<String>();
		//String text;
		do 
		{
			
			ele.sendKeys(Keys.ARROW_DOWN);
			s.add(ele.getAttribute("value"));
			if(s.contains("redmi"))
			{
				for(String text:s)
					System.out.println(text);
					
			}
			
		}while(!s.isEmpty());
			
		//Thread.sleep(3000);
		/*List<WebElement> ele1 = driver.findElements(By.xpath("//input[@class='_3704LK']"));
		
		System.out.println(ele1.size());
		for(WebElement alloption:ele1)
		{
			System.out.println(alloption.getText());
		}*/
		//driver.close();

	}

}
