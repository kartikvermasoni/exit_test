package Screens;

import org.openqa.selenium.support.PageFactory;

import base.baseclass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class apidemothirdscreen extends baseclass{
	public apidemothirdscreen(AppiumDriver<MobileElement> wd) {
		PageFactory.initElements(new AppiumFieldDecorator (wd),this);
	}
//	Locators For test 5
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]\r\n")
	MobileElement clicked_Graphics;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]\r\n")
	MobileElement clicked_Bitmapdecode;
	
	@AndroidFindBy(id = "android:id/aerr_restart")
	MobileElement clicked_Restart_App;

	public void click_Graphic() {
		clicked_Graphics.click();
	}

	public void click_Bitmapdecode() {
		clicked_Bitmapdecode.click();
		
	}
	public void click_Restart_App() {
		clicked_Restart_App.click();
	}

//	For test 6
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[10]\r\n")
	MobileElement clicked_Text;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]\r\n")
	MobileElement clicked_Linkify;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")
	MobileElement clicked_Hyperlink;
	
	@AndroidFindBy(id = "com.hmh.api:id/text1")
	MobileElement Verify_text;
	
	public void click_text() {
		clicked_Text.click();
	}
	public void click_linkify() {
		clicked_Linkify.click();
	}
	public void click_hyperlink() {
		clicked_Hyperlink.click();
	}
	public boolean verifying_outcome() {
		return Verify_text.isDisplayed();
	}
}
