package AutomationSiteDemoTests;
import org.testng.annotations.Test;

import AutomationSiteDemoPages.AutomationDemoSiteIndexPage;
import AutomationSiteDemoPages.AutomationDemoSiteRegisterationPage;
import ReusableComponents.ResuableComponenets;



public class AutomationDemoSiteFramesTest extends ResuableComponenets{
	
	@Test
	public static void FramesValidationscript() {
		AutomationDemoSiteIndexPage IndexPageObj = new AutomationDemoSiteIndexPage(driver);
		AutomationDemoSiteRegisterationPage searchRegistrationPageObj = new AutomationDemoSiteRegisterationPage(driver);
		
		
		
		IndexPageObj.NavigationArrow();
		searchRegistrationPageObj.SwitchTODropdownClick();
		searchRegistrationPageObj.FramesLink();
		
		
	}

}
