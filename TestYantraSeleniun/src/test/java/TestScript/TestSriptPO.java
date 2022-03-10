package TestScript;

import java.awt.font.TextLayout.CaretPolicy;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepo.CreatPurchaesOrder;
import ObjectRepo.HomePage;
import ObjectRepo.Login;
import ObjectRepo.PurchaseOrder;

public class TestSriptPO {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		Login lg = new Login(driver);
		CreatPurchaesOrder cpo = new CreatPurchaesOrder(driver);
		HomePage hp = new HomePage(driver);
		PurchaseOrder po = new PurchaseOrder(driver);

		Random ran = new Random();
		int ranNO = ran.nextInt(2000);

		try {
			driver.get("http://localhost:8888/index.php?module=Users&action=Logout");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			lg.login("admin", "admin");
			hp.mousOver(driver);
			hp.clickPurcheasOrder();
			po.clickCreatPO();
			cpo.addSubData("Vikasratna"+ranNO);
			cpo.addVender(driver, "Vendors&action");
			cpo.backToWin(driver, "PurchaseOrder&action");
			cpo.statusDropdown("Delivered");
			cpo.addBillAdd();
			cpo.AddShippingAdress();
			cpo.addItem(driver, "Products&action");
			cpo.backToWin(driver, "PurchaseOrder&action");
			cpo.paasQuatity();
			cpo.clickOnSave();
			Thread.sleep(3000);
		} finally {
		//	 driver.close();
		}

	}

}
