package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  { // create class gor every webpage

	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/menuDnArrow.gif\"]")
	private WebElement more;
	
	@FindBy(xpath = "//div[@id=\"allMenu\"]/descendant::a[@name=\"Purchase Order\"]")
	private WebElement purchesOrder;

	public WebElement getPurchesOrder() {
		return purchesOrder;
	}



	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public WebElement getMore() {
		return more;
	}
	
	// business Libaeries
	
	public void mousOver(WebDriver driver) {
		
		Actions a = new Actions(driver);
		
		a.moveToElement(more).perform();
		
	}
	
	public void clickPurcheasOrder() {
		
		purchesOrder.click();
		
	}
	
}
