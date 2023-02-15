package Step_Definition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import Screens.apidemosecondscreen;
import base.baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Apidemo2step extends baseclass{
	private static Logger log = LogManager.getLogger(Apidemo2step.class);//logger for class 

	public  apidemosecondscreen second_obj = new apidemosecondscreen(wd);
	
//	For test 3
	
	@Given("^clicking on app$")
	public void clicking_on_app() throws Throwable {
		log.info("[Log]*****************************************Test Begins...*****************************************");
	   second_obj.click_App();
		Thread.sleep(500);
	}
	
	@When("^clicked text to speech$")
	public void clicked_text_to_speech() throws Throwable {
	   second_obj.click_text_to_speech();
		Thread.sleep(5000);
	}
	
	@When("^I complete clicking action$")
	public void i_complete_clicking_action() throws Throwable {
		Thread.sleep(5000);
	   second_obj.click_again();
		
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		 Assert.assertTrue(second_obj.verify_text_on_page());
			log.info("[Log]*****************************************Test Ends...*****************************************");
			Thread.sleep(500);
	}
	
// For test 4
	
	@Given("^I am on the homepage of apk and clicked app$")
	public void i_am_on_the_homepage_of_apk_and_clicked_app() throws Throwable {
		log.info("[Log]*****************************************Test Begins...*****************************************");
		second_obj.click_App();
	}

	@Then("^migrated to loader and clicked$")
	public void migrated_to_loader_and_clicked() throws Throwable {
		second_obj.click_Loader();
	    
	}

	@Given("^cursor custom throttled but tapped on custom$")
	public void cursor_custom_throttled_but_tapped_on_custom() throws Throwable {
		second_obj.click_custom();
	}

	@Then("^entered the search text \"([^\"]*)\"$")
	public void entered_the_search_text(String name) throws Throwable {
		Thread.sleep(2000);
		second_obj.click_button(name);
	}

	@Then("^I verify the \"([^\"]*)\" in step$")
	public void i_verify_the_in_step(String status) throws Throwable {
		Thread.sleep(2000);
		Assert.assertTrue(second_obj.verifying_Search_outcome());
		log.info("[Log]*****************************************Test Ends...*****************************************");
	
	}

}
