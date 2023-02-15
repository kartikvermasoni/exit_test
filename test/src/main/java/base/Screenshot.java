package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/*We implement Screenshot functionalites using this class*/

public class Screenshot {

	public static void takeScreenShot(AppiumDriver<MobileElement> wd,String filename) {

		String screenshotFileName = System.getProperty("user.dir");

		File scrFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(scrFile, new File(screenshotFileName + "/Screenshots/" + filename + ".png"));
		}
		catch (IOException e) {
		e.printStackTrace();
		}
		}

		
}
