package AutomationSiteDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationDemoSitDatepickerPage {
	
	WebDriver driver = null;
	
	By Date_Picker_Disabled = By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img");
	By Data_Picker_Disabled_Date = By.xpath("//td[@class='  ui-datepicker-current-day']/a");
	By Data_Picker_Disabled2 = By.xpath("//input[@id='datepicker2']");
	By Data_Picker_Disabled_Date2 = By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/a");
	
	public AutomationDemoSitDatepickerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void DatePickeDisabled() {
		driver.findElement(Date_Picker_Disabled).click();
	}
	
	public void DataPickerDisabledDate() {
		driver.findElement(Data_Picker_Disabled_Date).click();
	}
	
	public void DataPickerDisabled2() {
		driver.findElement(Data_Picker_Disabled2).click();
	}
	
	public void DataPickerDisabledDate2() {
		driver.findElement(Data_Picker_Disabled_Date2).click();
	}
	
	

}
