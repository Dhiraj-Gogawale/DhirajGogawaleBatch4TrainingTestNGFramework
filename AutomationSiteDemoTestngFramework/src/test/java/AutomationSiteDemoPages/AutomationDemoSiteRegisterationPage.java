package AutomationSiteDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class AutomationDemoSiteRegisterationPage {
	
WebDriver driver = null;

	
	By First_Name = By.xpath("//input[@placeholder='First Name']");
	By Last_Name = By.xpath("//input[@placeholder='Last Name']");
	By Customer_Address = By.xpath("//textarea[@ng-model='Adress']");
	By Customer_EmailAddress = By.xpath("//input[@type='email']");
	By Customer_Telephonenuber = By.xpath("//input[@type='tel']");
	By Customer_Gender = By.xpath("//input[@value='Male']");
	By Customer_GenderList = By.xpath("//input[@type='radio' and contains(@name,'radiooptions')]");
	By Customer_Hobbies = By.xpath("//input[@value='Movies']");
	By Customer_Language = By.xpath("//div[@id='msdd']");
	By SelectCustomer_LanguageFromList = By.xpath("//a[@class='ui-corner-all' and contains(text(),'English')]");
	By Customer_Skills = By.xpath("//Select[@id='Skills']");
	By Customer_CountryDropDown = By.xpath("//select[@id='countries']");
	By CustomerSelect_CountryDropDown = By.xpath("//span[@class='select2-selection__arrow']");
	By CustomerSelect_CountryFromList = By.xpath("//span[@class='select2-results']//ul//li[6]");
	By Select_Year = By.xpath("//select[@id='yearbox']");
	By Select_Month = By.xpath("//select[@placeholder='Month']");
	By Select_Date = By.xpath("//select[@id='daybox']");
	By Enter_Password = By.xpath("//input[@id='firstpassword']");
	By Enter_ConfirmPassword = By.xpath("//input[@id='secondpassword']");
	By Click_SubmitButton = By.xpath("//button[@id='submitbtn']");
	By SwitchTo_Dropdown = By.xpath("//a[contains(text(),'SwitchTo')]");
	By Alerts_Links = By.xpath("//a[contains(text(),'Alerts')]");
	By Windows_Link = By.xpath("//a[contains(text(),'Windows')]");
	By Frames_Link = By.xpath("//a[contains(text(),'Frames')]");
	By Widgets_Link = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Widgets')]");
	By DatepickeLink_Link = By.xpath("//a[@style='color: white' and contains(text(),' Datepicker ')]");
	By Interactions_Link = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Interactions ')]");
	By Selectable_Link= By.xpath("//a[contains(text(),'Selectable ')]");
	
	
	
	public AutomationDemoSiteRegisterationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void EnterFirstName(String text) {
		driver.findElement(First_Name).sendKeys(text);
	}
	
	public void EnterLastName(String text) {
		driver.findElement(Last_Name).sendKeys(text);
	}
	
	public void EnterCustomerAddress(String text) {
		driver.findElement(Customer_Address).sendKeys(text);
	}
	
	public void EnterCustomerEmailAddress(String text) {
		driver.findElement(Customer_EmailAddress).sendKeys(text);
	}
	
	public void EnterCustomerTelephonenumber(String text) {
		driver.findElement(Customer_Telephonenuber).sendKeys(text);
	}
	
	public void EnterCustomerGender() throws Exception {
		driver.findElement(Customer_Gender).click();
		//Youtube Link --> https://www.youtube.com/watch?v=BH8tIkigC0Y
		//boolean isChecked = false;
		//List <WebElement> radioButtons = driver.findElements(Customer_GenderList);
		//int size = radioButtons.size();
		//System.out.println("Size of List " +size);
		//for (int i=0; i<size; i++) {
			//isChecked = radioButtons.get(i).isSelected();
			
			//if(!isChecked) {
				//radioButtons.get(i).click();
				//Thread.sleep(2000);
			//}
			
		//}
	}
	
	public void EnterCustomerHobbies() {
		driver.findElement(Customer_Hobbies).click();
	}
	
	public void CustomerLanguageBox() {
		driver.findElement(Customer_Language).click();
		//driver.findElement(Customer_Language).sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER);
		//driver.findElement(Customer_Language).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
	}
	
	public void SelectCustomerLanguageFromList() {
		driver.findElement(SelectCustomer_LanguageFromList).click();
	}
	
	//Youtube URL --> https://www.youtube.com/watch?v=NV1uzqyxZPw&t=11s
	public void EnterCustomerSkills() {
		Select objSelect = new Select(driver.findElement(Customer_Skills));
				objSelect.selectByVisibleText("AutoCAD");
				
				//Below are two more different ways by which we can select value from drop down. 1) ByIndex 2) ByValue
				//objSelect.selectByIndex(4);
				//objSelect.deselectByValue("AutoCAD");
				
				
	}
	
	public void EnterCustomerCountry() {
		Select objSelect = new Select(driver.findElement(Customer_CountryDropDown));
		objSelect.selectByVisibleText("India");
		
	}
	
	public void SelectCustomerCountry() {
		driver.findElement(CustomerSelect_CountryDropDown).click();	
		
	}
	
	public void SelectCustomerCountryFromList() {
		driver.findElement(CustomerSelect_CountryFromList).click();	
		
	}
	
	
	
	public void SelectYear() {
		Select objSelect = new Select(driver.findElement(Select_Year));
		objSelect.selectByVisibleText("1962");
		
	}
	
	public void SelectMonth() {
		Select objSelect = new Select(driver.findElement(Select_Month));
		objSelect.selectByVisibleText("May");
		
	}
	
	public void SelectDay() {
		Select objSelect = new Select(driver.findElement(Select_Date));
		objSelect.selectByVisibleText("31");	
	}
	
	public void EnterPassword(String text) {
		driver.findElement(Enter_Password).sendKeys(text);
	}
	
	public void EnterConfirmPassword(String text) {
		driver.findElement(Enter_ConfirmPassword).sendKeys(text);
	}
	
	public void clickSubmitButton() {
		driver.findElement(Click_SubmitButton).click();
	}
	
	public void verifyTitle() {
		String my_title = driver.getTitle();
		System.out.println("Title is " +my_title);
		String Expected_Title= "Web Table";
		Assert.assertEquals(my_title, Expected_Title);
		System.out.println("Test Completed");
	}
	
	public void SwitchTODropdownClick() {
		driver.findElement(SwitchTo_Dropdown).click();
	}
	
	public void AlertsLink() {
		driver.findElement(Alerts_Links).click();
	}
	
	public void WindowsLink() {
		driver.findElement(Windows_Link).click();
	}
	
	public void FramesLink() {
		driver.findElement(Frames_Link).click();
	}
	
	public void WidgetsLink() {
		driver.findElement(Widgets_Link).click();
	}
	
	public void DatepickeLink() {
		driver.findElement(DatepickeLink_Link).click();
	}
	
	public void InteractionsLink() {
		driver.findElement(Interactions_Link).click();
	}

	public void SelectableLink() {
		driver.findElement(Selectable_Link).click();
	}
}
