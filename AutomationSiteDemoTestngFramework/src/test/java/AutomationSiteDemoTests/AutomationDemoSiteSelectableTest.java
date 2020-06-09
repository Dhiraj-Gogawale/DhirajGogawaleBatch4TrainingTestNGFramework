package AutomationSiteDemoTests;

import org.testng.annotations.Test;

import AutomationSiteDemoPages.AutomationDemoSiteIndexPage;
import AutomationSiteDemoPages.AutomationDemoSiteRegisterationPage;
import AutomationSiteDemoPages.AutomationDemoSiteSelectablePage;
import ReusableComponents.ResuableComponenets;

public class AutomationDemoSiteSelectableTest extends ResuableComponenets {
	
	@Test
	public static void SelectTableValidation() throws InterruptedException {
		
	
	AutomationDemoSiteIndexPage IndexPageObj = new AutomationDemoSiteIndexPage(driver);
	AutomationDemoSiteRegisterationPage searchRegistrationPageObj = new AutomationDemoSiteRegisterationPage(driver);
	AutomationDemoSiteSelectablePage SelectTableObj = new AutomationDemoSiteSelectablePage(driver);
	
	IndexPageObj.NavigationArrow();
	searchRegistrationPageObj.InteractionsLink();
	searchRegistrationPageObj.SelectableLink();
	SelectTableObj.SakinaliumReadability();
	SelectTableObj.SakinaliumSingleLineCoding();
	SelectTableObj.SakinaliumSerializebtn();
	SelectTableObj.SakinaliumFunctionalTesting();
	SelectTableObj.SakinaliumDataDrivenTesting();
		
	}

}
