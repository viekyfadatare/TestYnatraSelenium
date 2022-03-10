package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrder {
	
	@FindBy(xpath = "//img[@title=\"Create Purchase Order...\"]")
	private WebElement createPO;

	public WebElement getCreatePO() {
		return createPO;
	}

	
	public PurchaseOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public PurchaseOrder() {
		// TODO Auto-generated constructor stub
	}


	public void clickCreatPO() {
		createPO.click();
	}
	
}
