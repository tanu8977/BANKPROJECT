package StepDefnition;

import org.testng.annotations.Test;
//import com.aventstack.extentreports.MediaEntityBuilder;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cra.qa.util.TestUtil;
import com.qa.ExtentReportListener.ExtentReporterNG;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Utility;
import tyu.Jirapolicy;

public class PersonalloanTest extends TestBase {
	
	//public static String TESTDATA_SHEET_PATH = "C:\\Users\\tanuj.000\\workspace1\\GIRIJAPROJT\\src\\main\\resources\\TestData\\personal.xlsx";
	ExtentReports report;
	ExtentTest logger;
	Personalloans loan;
	String sheetName = "loan";

	
	
	
	public PersonalloanTest() throws IOException
	{
		super();
		//report=new ExtentReports("D:\\Report\\jhh.html");
	//	logger.log(LogStatus.INFO, "HOME");
		//getScreenshot(driver, screenshotName);
		
		
}
	
	
	
	@DataProvider
	public Object[][] getCRMTestData(){
	//	String sheetName = "loan";
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
//	@Jirapolicy(logTicketReady=true)
	@Test( dataProvider="getCRMTestData")
	public void validateCreateNewContact(String Purchase,String Salestax,String Finance,String Downpayment,String Loanamount,String LoanTerm,String InterestRate) throws IOException, InterruptedException{
		{
			setup();
			loan = new Personalloans();
			//loan = new Personalloans();
					
					loan.red(Purchase, Salestax, Finance, Downpayment, Loanamount, LoanTerm, InterestRate);
					logger.log(LogStatus.INFO, "HOME");
					 
					// TestBase.getScreensho(driver, huy);
					
					
					// }
					
		}
	}
		@AfterMethod
		public void tearDown(ITestResult result) throws IOException, InterruptedException
		{
			
			if(result.getStatus()==ITestResult.FAILURE)
			{
				 String huy = driver.getTitle();
				 Assert.assertEquals(huy, "kdjsa");
				String temp=Utility.captureScreenshots(driver, huy);
				logger.log(LogStatus.FAIL, "VerifyBlogTitle");
				//logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			}
			
			
			report.flush();
			driver.quit();
			
		}
		
		
	}


	
	
	





