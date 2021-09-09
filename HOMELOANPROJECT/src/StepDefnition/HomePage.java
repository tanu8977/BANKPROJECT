package StepDefnition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

	@FindBy(xpath = "//input[@id='email']")
	WebElement emil;
	
	@FindBy(xpath = "//input[@id='pass']")
	WebElement pss;
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}


	
	public void red(String emai)
	
	
	
	{
		emil.sendKeys(emai);
	}
	
	public void fr(String pass)
	{
	
		pss.sendKeys(pass);
		
	}
	
}
	
	
	
	

