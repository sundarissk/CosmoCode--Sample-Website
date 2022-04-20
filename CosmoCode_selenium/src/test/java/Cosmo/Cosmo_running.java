package Cosmo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cosmo_running {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/skuma/eclipse-workspace/SimpleSelenium/src/test/resources/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice/");
		
		driver.findElement(By.linkText("Click here to reload this page")).click();
		System.out.println("Click here to reload this page : is clicked");

		WebElement firstnametxt = driver.findElement(By.id("firstname"));
		firstnametxt.sendKeys("Sundari");

		WebElement lastnametxt = driver.findElement(By.className("lastname"));
		lastnametxt.sendKeys("Senthil");

		WebElement radio_local1 = driver.findElement(By.xpath("//input[@value='Female']"));
		radio_local1.click();
		System.out.println(radio_local1.isSelected());

		List<WebElement> checkbox1 = driver.findElements(By.xpath("//input[@type='Checkbox']"));
		for (WebElement chbx : checkbox1) {
			String checkboxname = chbx.getAttribute("value");
			if (checkboxname.equals("python ") || checkboxname.equals("java") || checkboxname.equals("vbscript")) {
				chbx.click();

			}

			WebElement dropelement = driver.findElement(By.xpath("//select[@name='age']"));
			Select drpage = new Select(dropelement);
			// drpage.selectByIndex(2); // under 30
			// drpage.selectByValue("30 to 39"); // under 40
			drpage.selectByVisibleText("Above 60"); // Above 60

			WebElement submitbut = driver.findElement(By.xpath("//input[@id='submit_htmlform']"));
			submitbut.click();

			
		}
	}
}
