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

public class Pre_migration_good_apk_test {

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
		
		
		cap.setCapability("appPackage", "org.thecommonsproject.android.phr.dev");
		cap.setCapability("appActivity", "org.thecommonsproject.android.phr.MainActivity");
		cap.setCapability("app", "C:\\Users\\Ciril\\Desktop\\Common Health app\\pre_migration_good_apk.apk");

		
		driver =new AndroidDriver(new URL("http://localhost:4723"), cap);
		
		
		System.out.println("Application Started....");
		
		WebDriverWait wait0 = new WebDriverWait(driver, 10);
	    WebElement elementwait0 = wait0.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.dev:id/next_button\"]"))); 
		WebElement Next= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.dev:id/next_button\"]"));
		Next.click();
		Next.click();
		Next.click();
		
		System.out.println("User viewed app intro....");
		
		WebElement termsofuse= driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"org.thecommonsproject.android.phr.dev:id/welcome_consent_tou_checkbox\"]"));
		termsofuse.click();
		WebElement privacypolicy= driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"org.thecommonsproject.android.phr.dev:id/welcome_consent_privacy_policy_checkbox\"]"));
		privacypolicy.click();
		WebElement getstarted= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.dev:id/welcome_consent_get_started\"]"));
		getstarted.click();
		
		System.out.println("User accepted terms of user and privacy policy....");
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
	    WebElement elementwait1 = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.ImageView[@resource-id=\"org.thecommonsproject.android.phr.dev:id/passcode_input_dot_0\"]"))); 
		WebElement passcodeinput0= driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"org.thecommonsproject.android.phr.dev:id/passcode_input_dot_0\"]"));
		passcodeinput0.click();
		new Actions(driver).sendKeys("666666").perform();
		
		System.out.println("User created a passcode....");
		
		WebElement useanyways= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.dev:id/dialog_negative_button\"]"));
		useanyways.click();
		
		WebElement passcodeinput1= driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"org.thecommonsproject.android.phr.dev:id/passcode_input_dot_0\"]"));
		passcodeinput1.click();
		new Actions(driver).sendKeys("666666").perform();
		
		System.out.println("User confirmed the passcode....");
		
	    WebDriverWait wait2 = new WebDriverWait(driver, 10);
	    WebElement elementwait2 = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.dev:id/negative_button\"]"))); 
		WebElement skipfornow= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.dev:id/negative_button\"]"));
		skipfornow.click();

		WebDriverWait wait3 = new WebDriverWait(driver, 10);
	    WebElement elementwait3 = wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Summary\"]")));
		WebElement userloggedin= driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Summary\"]"));
		
		System.out.println("User has successfully logged in....");
		
		WebElement addhealthcaredata= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.dev:id/link_provider_button\"]"));
		addhealthcaredata.click();
		
		WebElement findmedicalprovider= driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/search_src_text\"]"));
		findmedicalprovider.click();
		new Actions(driver).sendKeys("Smart").perform();
		
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
	    WebElement elementwait4 = wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"org.thecommonsproject.android.phr.dev:id/top_line_text_view\" and @text=\"SMART IT Sandbox\"]")));
	    WebElement smartitsandbox= driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"org.thecommonsproject.android.phr.dev:id/top_line_text_view\" and @text=\"SMART IT Sandbox\"]"));
		smartitsandbox.click();
		smartitsandbox.click();
		
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
	    WebElement elementwait5 = wait5.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"org.thecommonsproject.android.phr.dev:id/button_text\"]")));
		WebElement addhealthcaredata2= driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"org.thecommonsproject.android.phr.dev:id/button_text\"]"));
		addhealthcaredata2.click();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 10);
	    WebElement elementwait6 = wait6.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text=\"Login\"]")));
		WebElement patientlogin= driver.findElement(By.xpath("//android.widget.Button[@text=\"Login\"]"));
		patientlogin.click();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 10);
	    WebElement elementwait7 = wait7.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text=\"Approve\"]")));
		WebElement authorizeapplaunch= driver.findElement(By.xpath("//android.widget.Button[@text=\"Approve\"]"));
		authorizeapplaunch.click();
		
		// make sure app opens supported links in this app by default in the device app settings
		
		WebDriverWait wait8 = new WebDriverWait(driver, 10);
	    WebElement elementwait8 = wait8.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.dev:id/auth_successful_positive_button\"]")));
		WebElement confirmpatientinfo= driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"org.thecommonsproject.android.phr.dev:id/auth_successful_positive_button\"]"));
		confirmpatientinfo.click();
		
		System.out.println("User has successfully added the health care data....");
		
	}	
	}
