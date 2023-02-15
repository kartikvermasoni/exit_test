package base;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class baseclass {
		//Appium driver 
	
    public static AppiumDriver<MobileElement> wd  ;
    static AppiumDriverLocalService service;
    public static Properties prop  ;
  //  private static Logger log = LogManager.getLogger(baseclass.class);
	
    //----- Desired Capabilities-----
	
    public void setup() {
    	
    	//starting the server 
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
       
        POI_XL reader = new POI_XL("./src/main/java/base/reusable.xlsx");//reusable excel file path
        
        DesiredCapabilities capability = new DesiredCapabilities(); 
        capability.setCapability("platformName",reader.getCellData("Reusable_data", 0, 2));
        capability.setCapability("platformVersion",reader.getCellData("Reusable_data", 1, 2));
        capability.setCapability("appPackage",reader.getCellData("Reusable_data", 2, 2));
        capability.setCapability("appActivity",reader.getCellData("Reusable_data", 3, 2));
        capability.setCapability("deviceName",reader.getCellData("Reusable_data", 4, 2));
        capability.setCapability("app",reader.getCellData("Reusable_data", 5, 2));

      //calling server from url
        try {		
            wd = new AppiumDriver<MobileElement>(new URL(reader.getCellData("Reusable_data", 6, 2)),capability);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    //--- To Stop the Server
    public void Stopappium() {
        wd.quit();
        service.stop();
    }
  //method for screenshot//if any test fails
	
  	public void takeScreenShot(String testMethodName) {
  		String  screenshotFileName = System.getProperty("user.dir") + "./Screenshots"+ testMethodName +"_" + ".jpg";
  	
  		File scrFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
  		try {

  			FileUtils.copyFile(scrFile, new File(screenshotFileName));
  		} catch (IOException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  	}
  	
}
