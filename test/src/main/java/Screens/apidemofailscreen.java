package Screens;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class apidemofailscreen {
	public apidemofailscreen(AppiumDriver<MobileElement> wd) {
		PageFactory.initElements(new AppiumFieldDecorator (wd),this);
	}
//	Locators for test 7
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = \"Alert Dialogs\"]")
	MobileElement clicked_alertdialog;
	
	@AndroidFindBy(id = "com.hmh.api:id/text_entry_button")
	MobileElement clicked_textEntry_dialog;
	
	@AndroidFindBy(id = "com.hmh.api:id/username_edit")
	MobileElement clicked_Entername;

	@AndroidFindBy(id = "com.hmh.api:id/password_edit")
	MobileElement clicked_Enterpassword;
	
	@AndroidFindBy(id = "android:id/button1")
	MobileElement clicked_OK_button;
	
	@AndroidFindBy(id = "android:id/button2")
	MobileElement Verifying_button;
	
	
	public void alert_dialog() {
		clicked_alertdialog.click();
	}
	public void click_textEntry_dialog() {
		clicked_textEntry_dialog.click();
	}
	public void click_Entername(String name ) {
		clicked_Entername.sendKeys(name);
	}
	public void click_Enterpassword(String Password) {
		clicked_Enterpassword.sendKeys(Password);
	}
	public void click_OK_button() {
		clicked_OK_button.click();
		
	}
	public boolean verifying() {
		return Verifying_button.isDisplayed();
	}
	
}
