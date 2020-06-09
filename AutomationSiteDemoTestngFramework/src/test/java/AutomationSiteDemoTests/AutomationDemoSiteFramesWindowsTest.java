package AutomationSiteDemoTests;
import org.testng.annotations.Test;

import AutomationSiteDemoPages.AutomationDemoSiteIndexPage;
import AutomationSiteDemoPages.AutomationDemoSiteRegisterationPage;
import AutomationSiteDemoPages.AutomationDemoSiteWindowsPage;
import ReusableComponents.ResuableComponenets;

public class AutomationDemoSiteFramesWindowsTest extends ResuableComponenets {
	
	@Test
	public static void WindowsTypeValidation() throws InterruptedException {
		
	
	AutomationDemoSiteIndexPage IndexPageObj = new AutomationDemoSiteIndexPage(driver);
	AutomationDemoSiteRegisterationPage searchRegistrationPageObj = new AutomationDemoSiteRegisterationPage(driver);
	AutomationDemoSiteWindowsPage windowsPageObj = new AutomationDemoSiteWindowsPage(driver);
	
	IndexPageObj.NavigationArrow();
	searchRegistrationPageObj.SwitchTODropdownClick();
	searchRegistrationPageObj.WindowsLink();
	windowsPageObj.clickOpenNewTabbedWindowsButton();
	windowsPageObj.clickClickButtonOpenNewWindow();
	windowsPageObj.clickOpenNewSeprateWindowButton();
	windowsPageObj.clickClickButtonToOpenNewDriver();
	windowsPageObj.clickOpenSeprateMultipleWindowButton();
	windowsPageObj.clickClickButtonToOpenMultipleWindow();
	
	}

}
