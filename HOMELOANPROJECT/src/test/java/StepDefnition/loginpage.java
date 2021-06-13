package StepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	
	
	
	@FindBy(xpath = "//input[@id='txtMyClientNumber_field']")
	WebElement no;
	
	@FindBy(xpath = "//input[@id='txtMyPassword_field']")
	WebElement pwd;
	
	@FindBy(xpath ="//input[@id='chkRemember_field']")
	WebElement chk;
	
	@FindBy(xpath = "//input[@id='btnLogon_field']")
	WebElement submit;
	
	WebDriver driver;
	public loginpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clnt(String nu)
	{
		no.sendKeys(nu);
	}
	
	
	public void password(String yu)
	{
		pwd.sendKeys(yu);
	}
	
	public void room()
	{
    WebElement option1 = driver.findElement(By.xpath("//input[@id='chkRemember_field']"));
    option1.click();
    
	// Check whether the Check box is toggled on 		
    if (option1.isSelected()) {					
        System.out.println("Checkbox is Toggled On");					

    } else {			
        System.out.println("Checkbox is Toggled Off");					
    }		
     				
    WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
    for (int i=0; i<2; i++) {											
        chkFBPersist.click (); 			
        System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
    }		
	  		
}		
	public void submi()
	{
		submit.click();
	}
	
	

}
