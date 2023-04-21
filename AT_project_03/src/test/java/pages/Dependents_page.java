package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import base_class.Base_Class;

public class Dependents_page extends Base_Class {
	ExtentTest report;
	@FindBy (xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy (name="password")
	WebElement password;
	@FindBy (xpath="//button[@type='submit']")
	WebElement logbutton;
	@FindBy (xpath="//span[text()='PIM']")
	WebElement Pmi;
	@FindBy (xpath="//li//a[text()='Add Employee']")
	WebElement AddEmplo;
	@FindBy (xpath="//div//input[@placeholder='Middle Name']/ancestor::div//input[@placeholder='First Name']")
	WebElement FirstName;
	@FindBy (xpath="//div//input[@placeholder='Middle Name']")
	WebElement midname;
	@FindBy (xpath="//div//input[@placeholder='Last Name']")
	WebElement lastname;
	@FindBy (xpath="//div[@class='oxd-form-actions']//following::button[2]")
	WebElement Submit;
	
	
	@FindBy(xpath="//div//a[text()='Dependents']")
	WebElement Dependents;
	@FindBy(xpath="//h6[text()='Assigned Dependents']//following::i[1]")
	WebElement ADD;
	@FindBy(xpath="//div//label[text()='Name']//following::input[1]")
	WebElement Name;
	@FindBy(xpath="//div//label[text()='Date of Birth']//following::input[1]")
	WebElement DOB;
	@FindBy(xpath="//div//p//following::button[@type='submit']")
	WebElement save;
	
	
	
	
	public Dependents_page(){
		PageFactory.initElements(driver, this);

}
	public void PIM_Dependents() {
		//Actions act= new Actions(driver);
		report = extent.createTest("validating PIM Dependents").assignDevice("windoes");
		   report.info("Testing the PMI_Page Dependents ");
		  
		   
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		try {
		username.sendKeys(userid());
		password.sendKeys(password());
		logbutton.click();
		}catch (Exception e){
			report.fail("failed to login");
		}
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		Pmi.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		AddEmplo.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		FirstName.sendKeys("Mano");
		midname.sendKeys("j");
	lastname.sendKeys("kumar");
	Submit.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	Dependents.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	    
	try {
		Name.sendKeys("mano");
		DOB.sendKeys("2000-10-07");
		save.click();
	}catch(Exception e) {
		report.fail("failed to fill the details");
		
	}
   
	try {
		if(Name.getText().contentEquals("mano")&&
				DOB.getText().contentEquals("2000-10-07")) {
			report.pass("user can see detaills what he/she filled ");
		}
	}catch (Exception e) {
		report.fail("user can't see detaills wht he/she filled");
	}
	
	
	
	
	
	}
}
