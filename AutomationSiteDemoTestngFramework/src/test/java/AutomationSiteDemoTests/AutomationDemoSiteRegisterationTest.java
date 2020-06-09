package AutomationSiteDemoTests;

import org.testng.annotations.Test;

import AutomationSiteDemoPages.AutomationDemoSiteIndexPage;
import AutomationSiteDemoPages.AutomationDemoSiteRegisterationPage;
import ReusableComponents.ResuableComponenets;

public class AutomationDemoSiteRegisterationTest extends ResuableComponenets{
	
	/*@Test
	public static void Registrationscript() throws Exception {
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");	    
		WebDriver driver = new ChromeDriver();*/
		
		@Test
		public static void Registrationscript() throws Exception {	
		
		AutomationDemoSiteRegisterationPage searchRegistrationPageObj = new AutomationDemoSiteRegisterationPage(driver);
		AutomationDemoSiteIndexPage IndexPageObj = new AutomationDemoSiteIndexPage(driver);
		
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);*/
		
		IndexPageObj.NavigationArrow();
		searchRegistrationPageObj.EnterFirstName("ABCD");
		searchRegistrationPageObj.EnterLastName("EFG");
		searchRegistrationPageObj.EnterCustomerAddress("MG Road");
		searchRegistrationPageObj.EnterCustomerEmailAddress("abcd15@gmail.com");
		searchRegistrationPageObj.EnterCustomerTelephonenumber("9999999995");
		searchRegistrationPageObj.EnterCustomerGender();
		searchRegistrationPageObj.EnterCustomerHobbies();
		
		searchRegistrationPageObj.CustomerLanguageBox();
		searchRegistrationPageObj.SelectCustomerLanguageFromList();
		
		searchRegistrationPageObj.EnterCustomerSkills();
		searchRegistrationPageObj.EnterCustomerCountry();
		searchRegistrationPageObj.SelectCustomerCountry();
		searchRegistrationPageObj.SelectCustomerCountryFromList();
		searchRegistrationPageObj.SelectYear();
		searchRegistrationPageObj.SelectMonth();
		searchRegistrationPageObj.SelectDay();
		searchRegistrationPageObj.EnterPassword("BPs@1234");
		searchRegistrationPageObj.EnterConfirmPassword("BPs@1234");
		searchRegistrationPageObj.clickSubmitButton();
		//driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		Thread.sleep(6000);
		searchRegistrationPageObj.verifyTitle();
		
		
		Thread.sleep(5000);
		
		
		driver.close();
	}

}
