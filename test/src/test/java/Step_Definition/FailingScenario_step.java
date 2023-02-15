package Step_Definition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import Screens.apidemofailscreen;
import Screens.apidemosecondscreen;
import base.baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FailingScenario_step extends baseclass {
	private static Logger log = LogManager.getLogger(FailingScenario_step.class);//logger for class 

	public  apidemofailscreen fail_obj = new apidemofailscreen(wd);	
	@Then("^migrated to Alert Dialogs and clicked$")
	public void migrated_to_Alert_Dialogs_and_clicked() throws Throwable {
		log.info("[Log]*****************************************Test Begins...*****************************************");
		fail_obj.alert_dialog();	

	}
	@Given("^many dialogs popup but tapped on Txt Entry Dialogs$")
	public void many_dialogs_popup_but_tapped_on_Txt_Entry_Dialogs() throws Throwable {
		fail_obj.click_textEntry_dialog();
	}

	@Then("^enter the Name in text entry\"([^\"]*)\"$")
	public void enter_the_Name_in_text_entry(String name) throws Throwable {
		fail_obj.click_Entername(name);
	}

	@Then("^enter the Password in text entry\"([^\"]*)\"$")
	public void enter_the_Password_in_text_entry(String Password) throws Throwable {
		fail_obj.click_Enterpassword(Password);
	}

	@Then("^tap on submit and assert it false$")
	public void tap_on_submit_and_assert_it_false() throws Throwable {
		Assert.assertFalse(fail_obj.verifying());	
		fail_obj.click_OK_button();
		log.info("[Log]*****************************************Test Ends...*****************************************");
	}


}
