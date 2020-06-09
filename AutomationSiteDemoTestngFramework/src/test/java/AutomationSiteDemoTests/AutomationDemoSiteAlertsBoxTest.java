package AutomationSiteDemoTests;

import org.testng.annotations.Test;

import AutomationSiteDemoPages.AutomationDemoSiteAlertsPage;
import AutomationSiteDemoPages.AutomationDemoSiteIndexPage;
import AutomationSiteDemoPages.AutomationDemoSiteRegisterationPage;

import ReusableComponents.ResuableComponenets;

public class AutomationDemoSiteAlertsBoxTest extends ResuableComponenets {
	
	@Test
	public static void AlertsPage() throws Exception {
		AutomationDemoSiteIndexPage IndexPageObj = new AutomationDemoSiteIndexPage(driver);
		AutomationDemoSiteRegisterationPage searchRegistrationPageObj = new AutomationDemoSiteRegisterationPage(driver);
		AutomationDemoSiteAlertsPage alertPageObj = new AutomationDemoSiteAlertsPage(driver);
		
		
		
		IndexPageObj.NavigationArrow();
		searchRegistrationPageObj.SwitchTODropdownClick();
		searchRegistrationPageObj.AlertsLink();
		alertPageObj.clickAlertwithOkandCancel();
		alertPageObj.clickAlertwithOK();
		alertPageObj.clickAlertBoxDisplayButton();
		alertPageObj.SimpleAlert();
		alertPageObj.clickAlertwithOkandCancel();
		alertPageObj.clickButtonToDisplayConfirmBox();
		alertPageObj.ConfirmationAlert();
		alertPageObj.verifyConfermationPopupMsgTxt();
		alertPageObj.clickAlertWithTextBox();
		alertPageObj.clickButtonToDemonstratePrompt();
		alertPageObj.sendText("Automation Tester");
		alertPageObj.checkReplyMsg();
		driver.close();
		
	}
	
	

}
