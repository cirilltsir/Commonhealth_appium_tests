package commonhealth_appium_tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class candidate_apk_test {	static WebDriver driver;

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

	cap.setCapability("noReset", "true");
	
	
	cap.setCapability("appPackage", "org.thecommonsproject.android.phr.dev");
	cap.setCapability("appActivity", "org.thecommonsproject.android.phr.MainActivity");
	cap.setCapability("app", "C:\\Users\\Ciril\\Desktop\\Common Health app\\candidate.apk");

	
	driver =new AndroidDriver(new URL("http://localhost:4723"), cap);
	
	
	System.out.println("Application Started....");
	
	
	WebElement passcodeinput1= driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"org.thecommonsproject.android.phr.dev:id/passcode_input_dot_0\"]"));
	passcodeinput1.click();
	new Actions(driver).sendKeys("666666").perform();
	
	System.out.println("User confirmed the passcode....");

	WebDriverWait wait3 = new WebDriverWait(driver, 10);
    WebElement elementwait3 = wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Summary\"]")));
	WebElement userloggedin= driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Summary\"]"));
	
	System.out.println("User has successfully logged in....");
	
	WebDriverWait wait4 = new WebDriverWait(driver, 10);
    WebElement elementwait4 = wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"org.thecommonsproject.android.phr.dev:id/updates_card_header\"]")));
    WebElement healthrecordsremainsaved= driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"org.thecommonsproject.android.phr.dev:id/updates_card_header\"]"));
    
    System.out.println("Health records remain saved....");
}}