package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;
import testBase.TestBase;

public class Step extends TestBase {
	LoginPage login = new LoginPage();
	@Given("^user open the browser$")
	public void user_open_the_browser() throws Throwable {
		TestBase.init();
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user login page$")
	public void user_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login.login("test","test");
	    throw new PendingException();
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}


