package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


	

	
@Test
public class Utility {
	public static String captureScreenshots(WebDriver driver, String Screenshot)throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source = ts. getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./Screenshots//faceb.png"));
			//System.out.println("Screenshot Taken");
			return Screenshot;
			
	
		


}
	}