package StepDefnition;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

 import tyu.Jirapolicy;

public class TestBase {
	
	 static WebDriver driver;
	
	
	
	// @Jirapolicy(logTicketReady=true)
		@Test
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (12)\\chromedriver.exe");
			driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/calcs/loan.php");
		
	}
	
		@Test
		//public void Utility {
			public static String captureScreenshots(WebDriver driver, String Screenshot)throws InterruptedException, IOException
			{
				 //driver=new FirefoxDriver();
					TakesScreenshot ts=(TakesScreenshot)driver;
					File source = ts. getScreenshotAs(OutputType.FILE);
					
					FileUtils.copyFile(source, new File("./Screenshots//facebook.png"));
					//System.out.println("Screenshot Taken");
					return Screenshot;
					
			
				


		}
			}	
		//return path;
		
		//	return null;
		
	



	
	
