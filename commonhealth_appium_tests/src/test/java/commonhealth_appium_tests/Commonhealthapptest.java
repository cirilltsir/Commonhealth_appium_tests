package commonhealth_appium_tests;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Commonhealthapptest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		try {
			openCommonhealthapp();
			
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		

	}

	
	public static void openCommonhealthapp() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Galaxy A10e");
		cap.setCapability("udid", "RF8N32JW5SZ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appium:automationName", "UiAutomator2");
		
		
		cap.setCapability("appPackage", "org.thecommonsproject.android.phr.developer");
		cap.setCapability("appActivity", "org.thecommonsproject.android.phr.MainActivity");
		cap.setCapability("app", "C:\\Users\\Ciril\\Desktop\\Common Health app\\113.apk");
//		URL url = new URL ("http://127.0.0.1:4723");
		
//		driver = new RemoteWebDriver(url, cap);
		
		driver =new AndroidDriver(new URL("http://localhost:4723"), cap);
		
		
		System.out.println("Application Started....");
	}
}
