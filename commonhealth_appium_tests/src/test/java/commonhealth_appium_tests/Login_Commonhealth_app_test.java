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

public class Login_Commonhealth_app_test {

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

		
		driver =new AndroidDriver(new URL("http://localhost:4723"), cap);
		
		
		System.out.println("Application Started....");
		
		WebElement Next= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.developer:id/next_button\"]"));
		Next.click();
		Next.click();
		Next.click();
		
		System.out.println("User viewed app intro....");
		
		WebElement termsofuse= driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"org.thecommonsproject.android.phr.developer:id/welcome_consent_tou_checkbox\"]"));
		termsofuse.click();
		WebElement privacypolicy= driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"org.thecommonsproject.android.phr.developer:id/welcome_consent_privacy_policy_checkbox\"]"));
		privacypolicy.click();
		WebElement getstarted= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.developer:id/welcome_consent_get_started\"]"));
		getstarted.click();
		
		System.out.println("User accepted terms of user and privacy policy....");
		
		WebElement passcodeinput0= driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"org.thecommonsproject.android.phr.developer:id/passcode_input_dot_0\"]"));
		passcodeinput0.click();
		new Actions(driver).sendKeys("666666").perform();
		
		System.out.println("User created a passcode....");
		
		WebElement useanyways= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.developer:id/dialog_negative_button\"]"));
		useanyways.click();
		
		WebElement passcodeinput1= driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"org.thecommonsproject.android.phr.developer:id/passcode_input_dot_0\"]"));
		passcodeinput1.click();
		new Actions(driver).sendKeys("666666").perform();
		
		System.out.println("User confirmed the passcode....");
		
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    WebElement elementwait = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.developer:id/negative_button\"]"))); 
		WebElement skipfornow= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.developer:id/negative_button\"]"));
		skipfornow.click();

		
		WebElement userloggedin= driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Summary\"]"));
		
		System.out.println("User has successfully logged in....");
		
	}	
	}