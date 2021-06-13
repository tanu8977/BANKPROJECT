package StepDefnition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpagetest {
 public static WebDriver driver = null;
 public static 	loginpage page = new loginpage(driver);
	
	@Given("the user login to the browser functionality")
	public void the_user_login_to_the_browser_functionality() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (10)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.my.commbank.com.au/netbank/Logon/Logon.aspx?cl=%2fNetBankIdentity%2fauthorize.aspx%3fclient_id%3dcommbank%26response_mode%3dform_post%26response_type%3did_token%26scope%3dopenid%26state%3dOpenIdConnect.AuthenticationProperties%253dIhihwiSA3_kyuth-RRqO2OkHw2xYTVI-FxEAXiFwfi3ZSFO5D4RC9iGVPwQhoXycBjNk0nOjMpyAMsyThoZrBCkbvk5t7Xo6InFOeZtFGJj4UVVmsKcLPoH_OQPa2rp_32Zv8m_vgLBb3aFDvy0yqDONhB76EGGbT4GVCIk0_Z4UeM9tZrTL-k6elZAlNd1yMR5G651FVDcaFR8TAwMQruu__qiYpqjGXTZlroWY8T4n1qoJyP1S1IKiG0R8YRqS9eTwZ52j0o9GaUMzRyWGqvqkY0WWprSBUHofItMnB6ujqdFQOwwSw1kcNdVNK0xIIjju%26nonce%3d637590589358587463.Y2YxOGMwZDgtNGZkMy00MGY4LThkYmUtYzI4NmRjYTk1ZWY4ZjExNDZhNjktZjkwNi00Y2JlLWFlZWMtYWZmNzk5Zjc0Nzgw%26redirect_uri%3dhttps%253a%252f%252fwww.commbank.com.au%252fdigital%252fIdentity%252fExternal%26x-client-SKU%3dID_NET461%26x-client-ver%3d5.3.0.0");
	}
	@When("^user enters (.*) in the cmk$")
	public void user_enters_Clientnumber_in_the_cmk(String nu) {
		page = new loginpage(driver);
		page.clnt(nu);
	}
	
	
	@When("^user also enters (.*) in the cmk$")
	public void user_also_enters_password_in_the_cmk(String yu) {
		page = new loginpage(driver);
	    page.password(yu);
	}

	@When("user clicks the clientnumber in the button")
	public void user_clicks_the_clientnumber_in_the_button() {
		page.room();
	}

	@Then("user clicks on logon button")
	public void user_clicks_on_logon_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}