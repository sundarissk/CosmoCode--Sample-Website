package Cosmo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Class.driver_launch;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Cosmo_coding {
	
	
	WebDriver driver = new ChromeDriver();

	static{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\skuma\\eclipse-workspace\\CosmoCode_selenium\\target\\driver\\chromedriver.exe");

	}
	
@BeforeMethod
public void url_open() 
{
		driver.get("https://cosmocode.io/automation-practice/");
		driver.manage().window().maximize();
	}
@Test
public void name_fill()
{	
        WebElement firstnametxt = driver.findElement(By.id("firstname"));
		firstnametxt.sendKeys("Sundari");

		WebElement lastnametxt = driver.findElement(By.className("lastname"));
		lastnametxt.sendKeys("Senthil");
}
@Test
public void radio_button() 
{
		WebElement radio_local1 = driver.findElement(By.xpath("//input[@value='Female']"));
		radio_local1.click();
		System.out.println(radio_local1.isSelected());
	
}

//select single check_box
@Test
public void single_checkbox()
	{
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='java']"));
		checkbox.click();
		 
		
	}
		
//Whole list in check_box
@Test
public void multiple_checkbox_all()
{
	List<WebElement> checkbox1=driver.findElements(By.xpath("//input[@type='Checkbox']"));
	System.out.println("Total checkboxes:"+ checkbox1.size());
	for(WebElement chbx : checkbox1) 
	{ 
		chbx.click();
	}
		 
		 }
		
//As per choice multiple_click
@Test 
public void multiple_checkbox_choice() 
	{
		List<WebElement> checkbox1 = driver.findElements(By.xpath("//input[@type='Checkbox']"));
		for (WebElement chbx : checkbox1) {
			String checkboxname = chbx.getAttribute("value");
			if (checkboxname.equals("python ") || checkboxname.equals("java") || checkboxname.equals("vbscript")) {
				chbx.click();

			}

		}
		
		
	

}}
