package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import base_class.Base_Class;

public class PIM_Persnal_ditails extends Base_Class{
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
	@FindBy(xpath="//div//a[text()='Personal Details']")
	WebElement Personal_Details;
	@FindBy(xpath="//div//label[text()='Employee Id']//following::input[1]")
	WebElement Employee_Id;
	@FindBy(xpath="//div//label[text()='License Expiry Date']//preceding::input[1]")
	WebElement Licence_number;
	@FindBy(xpath="//div//label[text()='License Expiry Date']//following::input[@placeholder='yyyy-mm-dd'][1]")
	WebElement Licence_ex_date;
	@FindBy(xpath="//div//label[text()='Date of Birth']//following::input[@placeholder='yyyy-mm-dd']")
	WebElement Date_of_birth;
	@FindBy(xpath="//p//following::button[@type='submit'][1]")
	WebElement save_button;
	
	
	public PIM_Persnal_ditails(){
		PageFactory.initElements(driver, this);

}
	public void PIM_persnal_ditails() throws Exception {
		Actions act= new Actions(driver);
			report = extent.createTest("validating PIM personal ditails").assignDevice("windoes");
			   report.info("Testing the PMI_Page of personal ditails ");
			  
			   JavascriptExecutor jes= (JavascriptExecutor)driver;	   
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
	Personal_Details.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	try {
			//Licence_number.sendKeys("756987");
		//jes.executeScript("arguments[0].value='756987'",Licence_number );
		//Licence_ex_date.sendKeys("2030-02-01");
		jes.executeScript("arguments[0].value='2030-02-01'", Licence_ex_date);
		//Date_of_birth.sendKeys("2000-10-07");
		jes.executeScript("arguments[0].value='2000-10-07'", Date_of_birth);
		jes.executeScript("arguments[0].click();",save_button);
	   //  save_button.click();
		}catch (Exception e) {
			report.fail("failed to fill the details");
		}
	      
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);	
	/* try{
			   if(Licence_number.getText().contentEquals("756987")) {
				   report.pass("user can see the  licence number what he/she filled");
			   }
		   }catch(Exception e) {
			   report.fail("user can't see the licence number what he/she filled");
			}*/
		try {
			if(Licence_ex_date.getText().contentEquals("2030-02-01")) {
				report.pass("user can see the licence Expari date what he/she filled");
			}
		}catch (Exception e) {
			report.fail("user can't see the licence Expari date what he/she filled");
		}
		try {
			if(Date_of_birth.getText().contentEquals("2000-10-07")) {
				report.pass("user can see the date of birth what he/she filled ");
			}
		}catch (Exception e) {
			report.fail("user can't see the date of birth what he/she filled");
		}
		   }
	    
	}
		
		
	


