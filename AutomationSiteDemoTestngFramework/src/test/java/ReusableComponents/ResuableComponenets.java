package ReusableComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class ResuableComponenets {
	
protected static WebDriver driver;
	
	@BeforeSuite
	public void SetUp (){
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/ChromeDriver/chromedriver.exe");	    
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
