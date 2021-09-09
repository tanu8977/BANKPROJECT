package StepDefnition;

//public class Personalloans {
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

	public class Personalloans extends TestBase  {

		@FindBy(name = "price")
		WebElement prc;
		
		@FindBy(name = "salestax")
		WebElement slstax;
		
		@FindBy(name = "financefees")
		WebElement fin;
		
		@FindBy(name = "down")
		WebElement dwn;
		
		@FindBy(name = "loanamount")
		WebElement loan;
		
		@FindBy(name = "rate")
		WebElement rte;
		
		@FindBy(name = "interval")
		WebElement payment;
		
		
		
		
		public Personalloans()
		{
			PageFactory.initElements(driver, this);
		}


		
		public void red(String pric,String salestx,String finance,String down,String loanamt,String rate, String interestRate)
		
		
		
		{
			prc.sendKeys(pric);
			slstax.sendKeys(salestx);
			fin.sendKeys(finance);
			dwn.sendKeys(down);
			loan.sendKeys(loanamt);
			rte.sendKeys(rate);
			payment.sendKeys(interestRate);
			
			
		}
		
		
		
		
	}

