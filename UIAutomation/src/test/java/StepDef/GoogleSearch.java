package StepDef;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Googlesearch;
import testBase.TestBase;
import testUtil.Tablehelper;

public class GoogleSearch extends TestBase {
	
	Googlesearch search = new Googlesearch(driver);
	//Tablehelper tab = new Tablehelper(driver);

@Given("^open google url$")
public void open_google_url() throws Throwable {
	TestBase.init();
	
	
	System.out.println("open the Google Url");
}

@When("^Ente the Text$")
public void ente_the_Text() throws Throwable {
	
	search.GoogleSearchdata("Testing");
	//Tablehelper.findwebelement();
	//Tablehelper.Webelementvalue();
	System.out.println("enter the text");
    }

@Then("^All Related options should display$")
public void all_Related_options_should_display() throws Throwable {
 
}

}
