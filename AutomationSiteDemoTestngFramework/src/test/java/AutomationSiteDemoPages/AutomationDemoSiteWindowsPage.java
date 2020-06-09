package AutomationSiteDemoPages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationDemoSiteWindowsPage {
	
WebDriver driver = null;
	
	
	By  Open_New_Tab_Button = By.xpath("//a[contains(text(),'Open New Tabbed Windows ')]");
	By Click_Button_Open_New_Tab = By.xpath("//*[@id=\"Tabbed\"]/a/button");
	By Click_Open_New_Seprate_Window_Button = By.xpath("//a[@class='analystic' and contains(text(),'Open New Seperate Windows')]");
	By Click_Open_Seperate_Window = By.xpath("//*[@id=\"Seperate\"]/button");
    By Click_Open_Seperate_Multipal_Window_Button = By.xpath("//a[contains(text(),'Open Seperate Multiple Windows')]");
    By Click_Open_Seperate_Multipal_Window = By.xpath("//*[@id=\"Multiple\"]/button");
    

	
	public AutomationDemoSiteWindowsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clickOpenNewTabbedWindowsButton() {
		driver.findElement(Open_New_Tab_Button).click();
	}
	
	public void clickClickButtonOpenNewWindow() throws InterruptedException {
		// Get current window handle
		String parentWinHandle = driver.getWindowHandle();
		
		System.out.println(" Parent window handle: " +parentWinHandle);
		driver.findElement(Click_Button_Open_New_Tab).click();
        
		// Get the window handles of all open windows
		Set<String> winHandles = driver.getWindowHandles();
		
		// Loop through all handles
        for(String handle: winHandles){
            if(!handle.equals(parentWinHandle)){
            driver.switchTo().window(handle);
            Thread.sleep(5000);
            System.out.println("Title of the new window: " + driver.getTitle());
            System.out.println("Closing the new window...");
            driver.close();
         // Switching the control back to parent window
            driver.switchTo().window(parentWinHandle);
            // Print the URL to the console
            System.out.println("Parent window URL: " + driver.getCurrentUrl());

            } 
          }
        }
		
	public void clickOpenNewSeprateWindowButton() throws InterruptedException {
		driver.findElement(Click_Open_New_Seprate_Window_Button).click();
	}
	
	public void clickClickButtonToOpenNewDriver() throws InterruptedException {
		// Get current window handle
				String parentWinHandle = driver.getWindowHandle();
				
				System.out.println(" Parent window handle: " +parentWinHandle);
		        driver.findElement(Click_Open_Seperate_Window).click();
		
		     // Get the window handles of all open windows
				Set<String> winHandles = driver.getWindowHandles();
				
				// Loop through all handles
		        for(String handle: winHandles){
		            if(!handle.equals(parentWinHandle)){
		            driver.switchTo().window(handle);
		            Thread.sleep(5000);
		            System.out.println("Title of the new window: " + driver.getTitle());
		            System.out.println("Closing the new window...");
		            driver.close();
		            // Switching the control back to parent window
		            driver.switchTo().window(parentWinHandle);
		            // Print the URL to the console
		            System.out.println("Parent window URL: " + driver.getCurrentUrl());

		            } 
		          }
	}
		
	public void clickOpenSeprateMultipleWindowButton() throws InterruptedException {
		driver.findElement(Click_Open_Seperate_Multipal_Window_Button).click();
	}
	
	public void clickClickButtonToOpenMultipleWindow() throws InterruptedException {
		// Get current window handle
				String parentWinHandle = driver.getWindowHandle();
				
				System.out.println(" Parent window handle: " +parentWinHandle);
		        driver.findElement(Click_Open_Seperate_Multipal_Window).click();
		
		     // Get the window handles of all open windows
				Set<String> winHandles = driver.getWindowHandles();
				
				// Loop through all handles
		        for(String handle: winHandles){
		            if(!handle.equals(parentWinHandle)){
		            driver.switchTo().window(handle);
		            Thread.sleep(5000);
		            System.out.println("Title of the new window: " + driver.getTitle());
		            System.out.println("Closing the new window...");
		            driver.close();
		            // Switching the control back to parent window
		            driver.switchTo().window(parentWinHandle);
		            // Print the URL to the console
		            System.out.println("Parent window URL: " + driver.getCurrentUrl());

		            }
		          }
	}

}
