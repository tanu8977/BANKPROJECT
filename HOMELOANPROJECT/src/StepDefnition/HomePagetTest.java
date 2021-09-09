package StepDefnition;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cra.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import tyu.Jirapolicy;

//import tyu.Jirapolicy;



public class HomePagetTest extends TestBase {
	
   HomePage hom;
	 String sheetName = "facebook";
	//static WebDriver driver= null;
	//String sheetname = "Sheet1";
	//HomePage home;
	//public WebDriver driver;
	//public ExtentReports extent;
	//public ExtentTest extentTest;
	
	
	
	
	public HomePagetTest() throws IOException
	{
		super();
		//getScreenshot(driver, screenshotName);
	}
	
	
	//@Jirapolicy(logTicketReady=true)
	//@Test
	//public void hghj()
	
	
	@DataProvider
	public Object[][] getCRMTestData(){
		String sheetName = "facebook";
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	
	
	  //  @Jirapolicy(logTicketReady=true)
		@Test(priority = 4, dataProvider="getCRMTestData")
		public void contract(String Email,String Password){
			{
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (12)\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				hom = new HomePage();
						
						hom.red(Email);
						hom.fr(Password);
		}
		}
			
	
	
	
	
	
	
	
}

