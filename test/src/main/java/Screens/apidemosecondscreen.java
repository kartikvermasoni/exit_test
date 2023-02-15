package Screens;

import org.openqa.selenium.support.PageFactory;

import base.baseclass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class apidemosecondscreen extends baseclass{
	public apidemosecondscreen(AppiumDriver<MobileElement> wd) {
		PageFactory.initElements(new AppiumFieldDecorator (wd),this);
	}
//	Locators For test 3
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]\r\n")
	MobileElement clicked_App;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[13]\r\n")
	MobileElement clicked_Text_to_speech;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	MobileElement verifying_text_onpage;
	
	@AndroidFindBy(id = "com.hmh.api:id/again_button")
	MobileElement clicked_Again;
	
	public void click_App() {
		clicked_App.click();
	}

	public void click_text_to_speech() {
		clicked_Text_to_speech.click();
		
	}
	public boolean verify_text_on_page() {
		return verifying_text_onpage.isDisplayed();
		
	}
	public void click_again() {
		clicked_Again.click();
	}
	
//	Locators for test 4
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[8]")
	MobileElement clicked_Loader;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]\r\n")
	MobileElement clicked_Custom;
	
	@AndroidFindBy(id = "android:id/search_button")
	MobileElement clicked_Search_button;
	
	@AndroidFindBy(id = "android:id/search_src_text")
	MobileElement Search_text;
	
	@AndroidFindBy(id = "com.hmh.api:id/text")
	MobileElement verify_Search_outcome;
	
	public void click_Loader() {
		clicked_Loader.click();
		
	}
	public void click_custom() {
		clicked_Custom.click();
		clicked_Search_button.click();
	}
	public void click_button(String name) {
		Search_text.sendKeys(name);
		
	}
	public boolean verifying_Search_outcome() {
		return verify_Search_outcome.isDisplayed();
	}
	
}
