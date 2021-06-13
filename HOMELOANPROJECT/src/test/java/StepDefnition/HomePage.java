package StepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private By borrow = By.xpath("//h6[contains(text(),'Borrowing calculator')]");
	
	private By repayment = By.xpath("//h6[contains(text(),'Repayment calculator')]");
	
	private By stamp = By.xpath(" //h6[contains(text(),'Stamp duty calculator')]");
	
	
	WebDriver driver;
	public  HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void borw()
	{
		driver.findElement(borrow).click();
	}
	
	public void repay()
	{
		driver.findElement(repayment).click();
		
	}
	public void stmp()
	{
		driver.findElement(stamp).click();
	}
}
