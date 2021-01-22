package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Configuration {
	AndroidDriver<AndroidElement> driver;
	@Parameters({"platform", "udid","device"})
	@BeforeTest
	public void setup( String platform, String udid, String device)  throws MalformedURLException, InterruptedException
	{

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", platform);
		desiredCapabilities.setCapability("deviceName",device);
		desiredCapabilities.setCapability("udid", udid);
		desiredCapabilities.setCapability("autoGrantPermissions",true);
		desiredCapabilities.setCapability("newCommandTimeout","30");
		//desiredCapabilities.setCapability("noReset", "true");
		//desiredCapabilities.setCapability("fullReset", "false");
//		desiredCapabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);

		desiredCapabilities.setCapability("appPackage", "com.unikrew.faceoff");
		desiredCapabilities.setCapability("appActivity", "com.ibm.jazzcash.view.splash.SplashActivity");

//		URL url = new URL("http://127.0.0.1:4444/wd/hub");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver<AndroidElement>(url,desiredCapabilities);
	}

	@AfterTest
	public void tearDown() 
	{
		driver.quit();

	}

}
