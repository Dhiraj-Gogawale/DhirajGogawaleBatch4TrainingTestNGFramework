package AutomationSiteDemoTests;

import org.testng.annotations.Test;

import AutomationSiteDemoPages.AutomationDemoSitDatepickerPage;
import AutomationSiteDemoPages.AutomationDemoSiteIndexPage;
import AutomationSiteDemoPages.AutomationDemoSiteRegisterationPage;
import ReusableComponents.ResuableComponenets;

public class AutomationDemoSiteDatepickerTest extends ResuableComponenets {
	
	@Test
	public static void DataPickerDateSelection() throws InterruptedException {
		
	
	AutomationDemoSiteIndexPage IndexPageObj = new AutomationDemoSiteIndexPage(driver);
	AutomationDemoSiteRegisterationPage searchRegistrationPageObj = new AutomationDemoSiteRegisterationPage(driver);
	AutomationDemoSitDatepickerPage datepickerobj = new AutomationDemoSitDatepickerPage(driver);
	
	IndexPageObj.NavigationArrow();
	searchRegistrationPageObj.WidgetsLink();
	searchRegistrationPageObj.DatepickeLink();
	datepickerobj.DatePickeDisabled();
	datepickerobj.DataPickerDisabledDate();
	datepickerobj.DataPickerDisabled2();
	datepickerobj.DataPickerDisabledDate2();
	
	

   }
}
