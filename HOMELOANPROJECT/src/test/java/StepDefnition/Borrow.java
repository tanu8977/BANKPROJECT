package StepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Borrow {
	
	private By Loan = By.name("applicants");
	
	private By dependant = By.xpath(" //select[@id='dependent-children']");
	
	private By lookhome = By.xpath(" //select[@id='buyer-type']");
	
	private By MyIncome = By.xpath("//input[@id='income']");
	
	private By LivingExpense = By.xpath("//input[@id='expense-living']");
	
	private By loanrepay = By.xpath("//input[@id='expense-homeLoan']");
	
	private By credit = By.xpath("//input[@id='expense-credit']");
	
	private By calculate = By.xpath("//button[@id='button-calculate']");
	
	
	WebDriver driver;
	public Borrow(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void red(String lon)
	{
		
		Select fr = new Select(driver.findElement(Loan));
		fr.selectByVisibleText(lon);
		
	}
	
	public void depend(String hty)
	{
		
		Select gr = new Select(driver.findElement(dependant));
		gr.selectByVisibleText(hty);
		
	}
	
	public void home(String nty)
	{
		
		Select hr = new Select(driver.findElement(lookhome));
		hr.selectByVisibleText(nty);
		
	}
	public void myhme(String fty)
	{
		
		driver.findElement(MyIncome).sendKeys(fty);
		
	}
	public void epense(String dty)
	{
		
		driver.findElement(LivingExpense).sendKeys(dty);
		
	}
	public void repay(String nty)
	{
		
		driver.findElement(loanrepay).sendKeys(nty);
		
	}
	public void credt(String cr)
	{
		driver.findElement(credit).sendKeys(cr);
	}
	
	public void cal()
	{
	driver.findElement(calculate).click();
	}
	
	
	

}
