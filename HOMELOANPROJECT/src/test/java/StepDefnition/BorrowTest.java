package StepDefnition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BorrowTest {
	public static WebDriver driver = null;
	HomePage homepage = new HomePage(driver);
	private Borrow brw;
	
	@Given("the user logins to the browser functionality")
	public void the_user_logins_to_the_browser_functionality() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (10)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.commbank.com.au/digital/home-loans/calculator/how-much-can-i-borrow");
	}

	//@When("the user fills the form sheetname {string} and rowNumber <rownumber>")
	//public void the_user_fills_the_form_sheetname_and_rowNumber_rownumber(String SheetName,Integer rownumber) throws InvalidFormatException, IOException {
	@When("the user fills the form sheetname {string} and rowNumber {int}")
	public void the_user_fills_the_form_sheetname_and_rowNumber(String SheetName, Integer rownumber) throws InvalidFormatException, IOException {	
		ExcelReader reader = new ExcelReader();
	    List<Map<String,String>> testdata= reader.getData("C:/Users/tanuj.000/workspace1/HOMELOANPROJECT/src/main/resources/TestData/BANK.xlsx", SheetName);
	
	    
	    String loan = testdata.get(rownumber).get("lon");
	   System.out.println("THE ANSWER IS "+loan);
	    String depd = testdata.get(rownumber).get("depend");
	    String lookhom = testdata.get(rownumber).get("lokhme");
	    String myicme = testdata.get(rownumber).get("MyIcme");
	    String expense = testdata.get(rownumber).get("Livingexpse");
	    String repay = testdata.get(rownumber).get("lonrepy");
	    String credit = testdata.get(rownumber).get("crdt");
	   
	    
	    brw = new Borrow(driver);
	    brw.red(loan);
	    brw.depend(depd);
	    brw.home(lookhom);
	    brw.myhme(myicme);
	    brw.epense(expense);
	    brw.repay(repay);
	    brw.credt(credit);
	}

	@When("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("A shows a successful message {string}")
	public void a_shows_a_successful_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
