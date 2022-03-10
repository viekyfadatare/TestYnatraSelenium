package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gorgiaus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.gorgias.com/");
		driver.manage().window().maximize();
		List<WebElement> menu = driver.findElements(By.xpath("//nav[@class=\"navbar-links static w-nav-menu\"]/descendant::div[@class=\"navbar-toggle__dropdown w-dropdown-toggle\"]"));
		menu.remove(1);
		Actions a = new Actions(driver);
		
		for (WebElement menus : menu) {

			String name = menus.getText();
			System.err.println(name);
			Thread.sleep(1000);
			menus.click();
			Thread.sleep(1000);
		
		List<WebElement> submenu = driver.findElements
		(By.xpath("//div[contains(.,'"+name+"')]/descendant::nav[@class=\"dropdown__navbar w-dropdown-list w--open\"]/descendant::div[@class=\"wrapper-text-link__nav-full-width\"]"));
		for (WebElement sub : submenu) {
			
			Thread.sleep(1000);

			a.moveToElement(sub).perform();

			System.out.println(sub.getText());
			

	}
		
		}
	
		driver.close();
}
}
