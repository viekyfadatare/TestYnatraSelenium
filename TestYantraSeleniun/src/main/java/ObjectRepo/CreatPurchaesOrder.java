package ObjectRepo;

import java.util.Iterator; 
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatPurchaesOrder {

	
	@FindBy(xpath = "//input[@name=\"subject\"]")
	private WebElement subject;

	@FindBy(xpath = "//input[@name=\"vendor_name\"]/following-sibling::img")
	private WebElement vendername;

	@FindBy(xpath = "//select[@name='postatus']")
	private WebElement status;

	@FindBy(xpath = "//textarea[@name=\"bill_street\"]")
	private WebElement billingAdress;

	@FindBy(xpath = "//textarea[@name=\"ship_street\"]")
	private WebElement shippingAdress;

	@FindBy(xpath = "//img[@id=\"searchIcon1\"]")
	private WebElement itemnmae;
	@FindBy(xpath = "//b[contains(.,'Grand Total')]/following::input[@title='Save [Alt+S]']")
	private WebElement save;
	
	@FindBy(xpath = "//input[@id=\"qty1\"]")
	private WebElement Quatity;

	public WebElement getQuatity() {
		return Quatity;
	}

	public WebElement getSubject() {
		return subject;
	}

	public CreatPurchaesOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public CreatPurchaesOrder() {
		// TODO Auto-generated constructor stub
	}

	public WebElement getVendername() {
		return vendername;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getBillingAdress() {
		return billingAdress;
	}

	public WebElement getShippingAdress() {
		return shippingAdress;
	}

	public WebElement getItemnmae() {
		return itemnmae;
	}

	// business libraries

	public void addSubData(String data) {

		subject.sendKeys(data);

	}

	public void addVender(WebDriver driver, String PartailWindowTitle) {
		vendername.click();

		Set<String> set = driver.getWindowHandles();

		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String win = it.next();
			driver.switchTo().window(win);
			String CurretnWindowTitle = driver.getTitle();
			if (CurretnWindowTitle.contains(PartailWindowTitle)) {
				break;
			}
		}

		driver.findElement(By.xpath("//a[contains(.,'VIkasratna')]")).click();
		
	}

	public void chooesStatus() {

		Select s = new Select(status);

		s.selectByValue("Delivered");
	}

	public void addBillAdd() {
		billingAdress.sendKeys("abc 4133044");
	}

	public void AddShippingAdress() {
		shippingAdress.sendKeys("xyz 413304");

	}

	public void addItem(WebDriver driver, String PartailWindowTitle) {
		itemnmae.click();
		Set<String> set = driver.getWindowHandles();

		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String win = it.next();
			driver.switchTo().window(win);
			String CurretnWindowTitle = driver.getTitle();
			if (CurretnWindowTitle.contains(PartailWindowTitle)) {
				break;
			}
		}

		driver.findElement(By.xpath("//a[@id=\"popup_product_352\"]")).click();
	

	}
	public void backToWin(WebDriver driver, String PartailWindowTitle) {

		Set<String> set = driver.getWindowHandles();

		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String win = it.next();
			driver.switchTo().window(win);
			String CurretnWindowTitle = driver.getTitle();
			if (CurretnWindowTitle.contains(PartailWindowTitle)) {
				break;
			}
		}
	}

	public void clickOnSave() {
		save.click();

	}
	
	public void statusDropdown(String statusName) {
		Select s=new Select(status);
		s.selectByValue(statusName);
	}
	
	public void paasQuatity() {
		Quatity.sendKeys("3");
	}

}
