package pages;

import java.util.concurrent.TimeUnit;

import org.apache.http.params.CoreProtocolPNames;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import base_class.Base_Class;

public class Contact_details extends Base_Class {
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
	
	@FindBy(xpath="//div//a[text()='Contact Details']")
	WebElement contact_Details;
	@FindBy(xpath="//div//label[text()='Home']//following::input[1]")
	WebElement home_num;
	@FindBy(xpath="//div//label[text()='Home']//following::input[2]")
	WebElement Mobile_nu;
	@FindBy(xpath="//div//label[text()='Home']//following::input[3]")
	WebElement Work_num;
	
	
	
	
	
	
	
	public Contact_details(){
		PageFactory.initElements(driver, this);

}
	public void PIM_contact_details() {
		//Actions act= new Actions(driver);
		report = extent.createTest("validating PIM contact ditails").assignDevice("windoes");
		   report.info("Testing the PMI_Page ");
		  
		   
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
	contact_Details.click();
	try {
	home_num.sendKeys("12345");
	Mobile_nu.sendKeys("1234567890");
	Work_num.sendKeys("54321");
	}catch (Exception e) {
		report.fail("failed to fill the details");
	}
	
	try {
		if(home_num.getText().contentEquals("12345")&&Mobile_nu.getText().contentEquals("1234567890")&&Work_num.getText().contentEquals("54321")) {
			report.pass("The user can see the details what he/she filled ");
		}
	}catch(Exception e) {
		report.fail("The user can't see the details what he/she filled");
	}
	
	
		
	}

}
