package AutomationSiteDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationDemoSiteSelectablePage {

	
	WebDriver driver = null;
	
	
	By Sakinalium_Readability = By.xpath("//*[@id=\"Default\"]/ul/li[1]/b");
	By Sakinalium_Single_Line_Coding = By.xpath("//*[@id=\"Default\"]/ul/li[2]/b");
	By Sakinalium_Serialize_btn = By.xpath("//a[contains(text(),'Serialize ')]");
	By Sakinalium_Functional_Testing = By.xpath("//*[@id=\"Serialize\"]/ul/li[7]/b");
	By Sakinalium_DataDriven_Testing = By.xpath("//*[@id=\"Serialize\"]/ul/li[6]/b");
	
	
	
	
	
	public AutomationDemoSiteSelectablePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void SakinaliumReadability() {
		driver.findElement(Sakinalium_Readability).click();
	}
	
	public void SakinaliumSingleLineCoding() {
		driver.findElement(Sakinalium_Single_Line_Coding).click();
	}
	
	public void SakinaliumSerializebtn() {
		driver.findElement(Sakinalium_Serialize_btn).click();
	}
	
	public void SakinaliumFunctionalTesting() {
		driver.findElement(Sakinalium_Functional_Testing).click();
	}
	
	public void SakinaliumDataDrivenTesting() {
		driver.findElement(Sakinalium_DataDriven_Testing).click();
	}
	
	
}
