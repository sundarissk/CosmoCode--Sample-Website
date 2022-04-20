package Base_Class;

import org.testng.annotations.BeforeSuite;

public class driver_launch {
	@BeforeSuite
	public void Property() {
	System.setProperty("webdriver.chrome.driver",
			"C:/Users/skuma/eclipse-workspace/SimpleSelenium/src/test/resources/driver/chromedriver.exe");
}
	}
