package pages;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import base_class.Base_Class;

public class Drop_Down_validate extends Base_Class {
	ExtentTest report;
	Actions act;
	@FindBy (xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy (name="password")
	WebElement password;
	@FindBy (xpath="//button[@type='submit']")
	WebElement logbutton;
	@FindBy(xpath="//a//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	WebElement Admin;
	@FindBy(xpath="//div//label[text()='User Role']")
	WebElement user_role;
	@FindBy(xpath="//div//label[text()='Status']")
	WebElement Status_Drop_Down;
	@FindBy(xpath="//div//label[text()='User Role']//following::div[text()='-- Select --'][1]")
    WebElement Select_Admin_ESS;	
	@FindBy(xpath="//div//label[text()='Status']//following::div[text()='-- Select --']")
	WebElement select_Enabled_Disabled;
	@FindBy(xpath="//div//label[text()='User Role']//following::div[text()='Admin'][1]")
	WebElement select_Admin;
	@FindBy(xpath="//div//label[text()='User Role']//following::div[text()='ESS'][1]")
    WebElement select_ESS;
	@FindBy(xpath="//div//label[text()='Status']//following::div[text()='Disabled'][1]")
    WebElement select_Disabled;
	@FindBy(xpath="//div//label[text()='Status']//following::div[text()='Enabled'][1]")
    WebElement select_Enabled;
	
	public Drop_Down_validate(){
		PageFactory.initElements(driver, this);
	}
	public void TC_PIM_Dropdown_validate() throws Exception {
		report = extent.createTest("Tc_PMI_01").assignCategory("smoke").assignDevice("windoes");
		    report.info("TC_PMI_01");
		  driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		  driver.manage().window().maximize();
		  username.sendKeys(userid());
			password.sendKeys(password());
			logbutton.click();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		   act= new Actions(driver);
		  act.moveToElement(Admin).click().build().perform();
		  driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		 
		  if(user_role.isDisplayed()||Status_Drop_Down.isDisplayed()){
			  report.pass("the both user role and status are displed");
		 }else {
			 report.fail("user role and status not displayed");
		 }
	
		  
		  try {	 
		act.moveToElement(Select_Admin_ESS).click().build().perform();
		if( select_Admin.isDisplayed() && select_ESS.isDisplayed()) {
			 report.pass("Admin and ESS is displayed in the dropdown");
		}
	    }catch (Exception e) {
		report.fail("dropdown is not displayed");
	    }
	
	
		 try {
			 act.moveToElement(Status_Drop_Down).click().build().perform();
			if(select_Enabled.isDisplayed()&& select_Disabled.isDisplayed()) {
				report.pass("the both Enable and disabled is displayed");
			}
		 }catch (Exception e) {
			 report.fail("The both Enable and disabled is not displayed");
		 }
	}
}
	
		   
		    
		    
	    
		 
		 
		 	  
		
		
	
	
	
	
	
	
	


