package Practice;

import java.security.Key;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class spiceJet {

	public static void main(String[] args) throws InterruptedException {ChromeOptions c = new ChromeOptions();
	c.addArguments("--disable-notifications");
	
	WebDriver driver = new ChromeDriver(c);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com/");
	//driver.findElement(By.xpath("//div[text()='Delhi']"));
	driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/descendant::input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).sendKeys("DEL");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/descendant::input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).sendKeys("BOM");
	
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-testid='undefined-month-February-2022']/descendant::div[text()='20']")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click(); 
    
    Set<String> allTabs = driver. getWindowHandles();
    for(String tab:allTabs) {
		driver.switchTo().window(tab);
		} 
   // driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-1xfd6ze r-1loqt21 r-xoduu5 r-18u37iz r-1777fci r-1j3t67a r-1w50u8q r-ah5dr5 r-1otgn73']")).click();

   
   
  //  driver.findElement(By.xpath("(//div[@data-testid='spiceflex-flight-select-radio-button-2'])[1]"));
    Thread.sleep(3000);
  
    //  driver.findElement(By.xpath("(//[name()='svg']//[local-name()='g' ]//*[local-name()='circle' and @stroke-width=\"2\"])[1]")).click();
   driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1xdf14d']/div[1]/div/div[2]/div[2]//div[@class='css-1dbjc4n']/*[name()='svg']")).click();
   Thread.sleep(3000);  
   
   //driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep']/div[2]/div[4]/div[text()='Continue']")).click();
driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta' and @style='padding-right: 38px; padding-left: 38px; background-image: linear-gradient(rgb(252, 182, 62), rgb(247, 148, 29));' ]")).click();
   
// driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1wtj0ep r-1f1sjgu']//div[@class='css-1dbjc4n r-18u37iz']/div[4]/div[2]")).click();
    Set<String> allTabs1 = driver. getWindowHandles();
    for(String tab1:allTabs1) {
		driver.switchTo().window(tab1);
		} 
    Thread.sleep(2000);
   
   // driver.findElement(By.xpath("(//[name()='svg' and @data-testid=\"svg-img\" and @viewBox=\"0 0 12 8\" and @width=\"12\"]//[local-name()='path'])[1]")).click();
  //driver.findElement(By.xpath("//div[text()='Mrs']")).click();
driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("manasa");
driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("salian");
driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("9947344555");
driver.findElement(By.xpath("//input[@data-testid=\"emailAddress-inputbox-contact-details\"]")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//input[@data-testid=\"city-inputbox-contact-details\"]")).sendKeys("mangalore");

driver.findElement(By.xpath("//input[@data-testid=\"traveller-0-first-traveller-info-input-box\"]")).sendKeys("xxx");
driver.findElement(By.xpath("//input[@data-testid=\"traveller-0-last-traveller-info-input-box\"]")).sendKeys("salian");
//driver.findElement(By.xpath("//input[@data-testid=\"sc-member-mobile-number-input-box\"]")).sendKeys("1234567891");
driver.findElement(By.xpath("//div[@data-testid=\"traveller-info-continue-cta\"]")).click();}

}
