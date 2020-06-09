package AutomationSiteDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationDemoSiteIndexPage {
	
WebDriver driver = null;
	
	By Navigation_Arrow = By.xpath("//img[@id='enterimg']");
	
	
	public AutomationDemoSiteIndexPage(WebDriver driver) {
		this.driver = driver;
	} 
	
	
	public void NavigationArrow () {
		driver.findElement(Navigation_Arrow).click();
	}

}
