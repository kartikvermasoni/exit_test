package Step_Definition;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import Screens.apidemofirstscreen;
import base.baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Apidemo1step extends baseclass {
	private static Logger log = LogManager.getLogger(Apidemo1step.class);//logger for class 
	public  apidemofirstscreen first_obj = new apidemofirstscreen(wd);
	
//	for test 1
	
	@Given("^I am on the homepage of apk$")
	public void i_am_on_the_homepage_of_apk() throws Throwable {
		log.info("[Log]*****************************************Test Begins...*****************************************");
		
	}

	@Given("^clicking on views$")
	public void clicking_on_views() throws Throwable {
		first_obj.click_views();
		Thread.sleep(50);
	}

	@When("^clicking on animations and (\\d+)d transition$")
	public void clicking_on_animations_and_d_transition(int arg1) throws Throwable {
		first_obj.click_animation();
		Thread.sleep(50);
	}

	@Then("^i should be able to migrate on (\\d+)d transition page$")
	public void i_should_be_able_to_migrate_on_d_transition_page(int arg1) throws Throwable {
	   Assert.assertTrue(first_obj.verify_transition());
		Thread.sleep(50);
	}
	@Then("^click on Lyon$")
	public void click_on_Lyon() throws Throwable {
		first_obj.click_lyon();
	  log.info("[Log]*****************************************Test Ends...*****************************************");
	}
	
// for test 2
	
	@Then("^click on switches i should be able to migrate inside page$")
	public void click_on_switches_i_should_be_able_to_migrate_inside_page() throws Throwable {
		log.info("[Log]*****************************************Test Begins...*****************************************");
		Thread.sleep(300);
		first_obj.swipe_actions();
		Thread.sleep(500);
		first_obj.swipe_actions();
		Thread.sleep(100);
		first_obj.click_on_switches();
	}

	@When("^i tap on switches over all the buttons$")
	public void i_tap_on_switches_over_all_the_buttons() throws Throwable {
		Thread.sleep(2000);
		first_obj.click_all_switches();
	}

	@Then("^check all the buttons are open$")
	public void check_all_the_buttons_are_open() throws Throwable {
		Assert.assertTrue(first_obj.verifying_on_switch_button());
		log.info("[Log]*****************************************Test Ends...*****************************************");
	}
	
}
