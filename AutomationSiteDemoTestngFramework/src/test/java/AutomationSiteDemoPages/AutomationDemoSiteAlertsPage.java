package AutomationSiteDemoPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AutomationDemoSiteAlertsPage {
	
	WebDriver driver = null;
	String alertMessage= " ";
	
	By  Alert_With_Ok = By.xpath("//a[contains(text(),'Alert with OK ') and @href='#OKTab']");
	By  Alert_With_Ok_and_Cancel = By.xpath("//a[contains(text(),'Alert with OK & Cancel ') and @href='#CancelTab']");
	By  Click_Btt_Display_Alert_Box = By.xpath("//button[contains(text(),'click the button to display an  alert box:')]");
	By Click_Btt_Display_Confirmation_Box = By.xpath("//button[contains(text(),'click the button to display a confirm box ')]");
	By Verifymsg_Of_ConfermationPop = By.xpath("//*[@id=\"demo\"]");
	By Alert_With_TextBox = By.xpath("//a[contains(text(),'Alert with Textbox ')]");
	By click_Button_To_Demonstrate_Prompt = By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]");
	By Reply_text = By.xpath("//p[@id=\"demo1\"]");
	
	public AutomationDemoSiteAlertsPage(WebDriver driver) {
		this.driver = driver;
	}



	public void clickAlertwithOK() {
		driver.findElement(Alert_With_Ok).click();
	}
	
	public void clickAlertwithOkandCancel() {
		driver.findElement(Alert_With_Ok_and_Cancel).click();
	}
	
	public void clickAlertBoxDisplayButton() {
		driver.findElement(Click_Btt_Display_Alert_Box).click();
	}
	
	//Their are 3 Types of Alerts. 1) SimpleAllert. 2) Confirmation Alert. 3) Premative Alert 
	//Simple Alert we have only one Ok button which we click by using alert.accpet() method.
	public void SimpleAlert() {
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(" Alert Message is : " +alertMessage);
		alert.accept();
	}
	
	public void clickButtonToDisplayConfirmBox() {
		driver.findElement(Click_Btt_Display_Confirmation_Box).click();
	}
    
	public void ConfirmationAlert() {
		Alert confermationalert = driver.switchTo().alert();
		String confermationalertmsg = driver.switchTo().alert().getText();
		System.out.println(" Confermation Message is :" +confermationalertmsg);
		confermationalert.accept();
	}
	
	public void verifyConfermationPopupMsgTxt() {
		String PressedOkText = driver.findElement(Verifymsg_Of_ConfermationPop).getText();
		System.out.println(" Actual Text Is " +PressedOkText);
		String ExpectedText = "You pressed Ok";
		Assert.assertEquals(PressedOkText, ExpectedText);
	}
	
	public void clickAlertWithTextBox() {
		driver.findElement(Alert_With_TextBox).click();
	}
	
	public void clickButtonToDemonstratePrompt () {
		driver.findElement(click_Button_To_Demonstrate_Prompt).click();
	}
	
	public void sendText(String text) {
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(" Alert Message is : " +alertMessage);
		alert.sendKeys(text);
		alert.accept();
	}
	
	public void checkReplyMsg() {
		String ReplyMsg = driver.findElement(Reply_text).getText();
		System.out.println(" " +ReplyMsg);
		String expectedMsg = "Hello Automation Tester How are you today";
		Assert.assertEquals(ReplyMsg, expectedMsg);
		System.out.println("Test Completed for Alerts Page");
				
	}
	
	

}
