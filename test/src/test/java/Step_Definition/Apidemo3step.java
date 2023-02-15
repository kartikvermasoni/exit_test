package Step_Definition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import Screens.apidemothirdscreen;
import base.baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Apidemo3step extends baseclass {
	private static Logger log = LogManager.getLogger(Apidemo3step.class);//logger for class 

	public  apidemothirdscreen third_obj = new apidemothirdscreen(wd);
	
//	test 5
	@Given("^clicking on graphics$")
	public void clicking_on_graphics() throws Throwable {
		log.info("[Log]*****************************************Test Begins...*****************************************");
	    third_obj.click_Graphic();
	}

	@Then("^i should be able to migrate on bitmap decode page$")
	public void i_should_be_able_to_migrate_on_bitmap_decode_page() throws Throwable {
		third_obj.click_Bitmapdecode();
	}

	@When("^clicking on bitmapdecode and getting output$")
	public void clicking_on_bitmapdecode_and_getting_output() throws Throwable {
		third_obj.click_Restart_App();
	}

	@Then("^click on open app again btn$")
	public void click_on_open_app_again_btn() throws Throwable {
		log.info("[Log]*****************************************Test Ends...*****************************************");
	    
	}

//	For test 6
	
	@Given("^clicking on text$")
	public void clicking_on_text() throws Throwable {
		log.info("[Log]*****************************************Test Begins...*****************************************");
	  third_obj.click_text();
	}

	@Then("^i should be able to migrate on linkify page$")
	public void i_should_be_able_to_migrate_on_linkify_page() throws Throwable {
		third_obj.click_linkify();
	}
    
	@When("^clicking on linkify$")
	public void clicking_on_linkify() throws Throwable {
		third_obj.click_hyperlink();
	}
	
	@When("^getting url text verified$")
	public void getting_url_text_verified() throws Throwable {
		Assert.assertTrue(third_obj.verifying_outcome());
		log.info("[Log]*****************************************Test Ends...*****************************************");
	}

}
