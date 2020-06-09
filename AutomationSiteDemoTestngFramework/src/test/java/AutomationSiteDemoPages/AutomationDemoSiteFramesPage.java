package AutomationSiteDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationDemoSiteFramesPage {

WebDriver driver = null;
	
	By  Alert_With_Ok = By.xpath("//a[contains(text(),'Alert with OK ') and @href='#OKTab']");
	
	public AutomationDemoSiteFramesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAlertwithOK() {
		driver.findElement(Alert_With_Ok).click();
	}

	
}
