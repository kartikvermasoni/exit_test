package Screens;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;

import base.baseclass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class apidemofirstscreen extends baseclass{
	

	public apidemofirstscreen(AppiumDriver<MobileElement> wd) {
		PageFactory.initElements(new AppiumFieldDecorator (wd),this);
	}
//	Locators for test 1
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[11]\r\n")
	MobileElement clicked_Views;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]\r\n")
	MobileElement clicked_animation;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]\r\n")
	MobileElement clicked_3dtransition;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView\r\n")
	MobileElement view_animation_3d;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]\r\n")
	MobileElement clicked_Lyon;
	
	public void click_views() {
		clicked_Views.click();
		
	}
	public void click_animation() {
		clicked_animation.click();
		clicked_3dtransition.click();
		
	}
	public boolean verify_transition() {
		return view_animation_3d.isDisplayed();
	}
	public void click_lyon() {
		clicked_Lyon.click();
	}
	
//	Locators for test 2
	//---- Function For Scrolling and Touch actions
	
	 public void swipe_actions() {

	        Dimension dimension = wd.manage().window().getSize();
	        int start_x = (int) (dimension.width * 0.9);																									//5822
	        int start_y = (int) (dimension.height * 0.9);
	        int end_x = (int) (dimension.height * 0.2);
	        int end_y = (int) (dimension.height * 0.1);
	        TouchAction touch = new TouchAction(wd);
	        touch.press(PointOption.point(start_x, start_y))
	        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
	        .moveTo(PointOption.point(end_x, end_y)).release().perform();

	    }	
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[10]\r\n")
	MobileElement clicked_on_Switches;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Switch[1]\r\n")
	MobileElement clicked_on_Switch1;
	
	@AndroidFindBy(id = "com.hmh.api:id/monitored_switch")
	MobileElement clicked_on_Switch3;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Switch[4]\r\n")
	MobileElement clicked_on_Switch4;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Switch[5]\r\n")
	MobileElement clicked_on_Switch5;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Switch[6]\r\n")
	MobileElement clicked_on_Switch6;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Switch[7]\r\n")
	MobileElement clicked_on_Switch7;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Switch[8]\r\n")
	MobileElement clicked_on_Switch8;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Switch[9]\r\n")
	MobileElement clicked_on_Switch9;
	
	@AndroidFindBy(id = "com.hmh.api:id/monitored_switch")
	MobileElement verifying_on_switch_btn;
	
	public void click_on_switches() throws Throwable {
		clicked_on_Switches.click();
	}
		public void click_all_switches() throws Throwable {
		clicked_on_Switch1.click();
		Thread.sleep(1000);
		clicked_on_Switch3.click();
		Thread.sleep(1000);
		clicked_on_Switch4.click();
		Thread.sleep(1000);
		clicked_on_Switch5.click();
		Thread.sleep(1000);
		clicked_on_Switch6.click();
		Thread.sleep(1000);
		clicked_on_Switch7.click();
		Thread.sleep(1000);
		clicked_on_Switch8.click();
		Thread.sleep(1000);
		clicked_on_Switch9.click();
		Thread.sleep(1000);
	}
		public boolean verifying_on_switch_button() {
			return verifying_on_switch_btn.isEnabled();//.isDisplayed();
		}
}
