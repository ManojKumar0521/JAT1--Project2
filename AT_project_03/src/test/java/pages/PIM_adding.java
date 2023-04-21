package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import base_class.Base_Class;

public class PIM_adding extends Base_Class {
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
	
	
	@FindBy (xpath="//h6[text()='Manoj kumar']")
	WebElement personaldetails;
	@FindBy(xpath ="//div//input[@class='oxd-input oxd-input--active']//following::div[39]//label")
	WebElement checkcox;
	@FindBy(xpath = "//div//input[@class='oxd-input oxd-input--active']//following::div[45]")
	WebElement user;
	@FindBy(xpath = "//div//input[@class='oxd-input oxd-input--active']//following::div[63]")
	WebElement pass;
	@FindBy(xpath = "//div//input[@class='oxd-input oxd-input--active']//following::div[67]")
	WebElement confpass;
	@FindBy(xpath="//div//h6[text()='Mano kumar']")
	WebElement manokumar;
	//PIM module validating in employee list
	@FindBy(xpath="//div//a[text()='Personal Details']")
	WebElement Personal_Details;
	@FindBy(xpath="//div//a[text()='Contact Details']")
	WebElement Contact_Details;
	@FindBy(xpath="//div//a[text()='Emergency Contacts']")
	WebElement Emergency_contacts;
	@FindBy(xpath="//div//a[text()='Dependents']")
	WebElement Dependents;
	@FindBy(xpath="//div//a[text()='Immigration']")
	WebElement Immigration;
	@FindBy(xpath="//div//a[text()='Job']")
	WebElement Job;
	@FindBy(xpath="//div//a[text()='Salary']")
	WebElement Salary;
	@FindBy(xpath="//div//a[text()='Tax Exemptions']")
	WebElement TaxExemptions;
	@FindBy(xpath="//div//a[text()='Report-to']")
	WebElement Report_to;
	@FindBy(xpath="//div//a[text()='Qualifications']")
	WebElement Qualifications;
	@FindBy(xpath="//div//a[text()='Memberships']")
	WebElement Memberships;
	
	
	
	
	
	
	

	
	

	
	
	
	public PIM_adding(){
		PageFactory.initElements(driver, this);

}
	
	//validationg the PIM adding function 
	public void PMI_adding_functon() throws Exception {
		report = extent.createTest("verify PMI_page").assignDevice("windoes");
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
	
	try {
     if(manokumar.isDisplayed()) {
    	 report.pass("Employe personal ditails added.");
     }
	}
    catch (Exception e) {
    	 report.fail("Empolye personal ditails is failed to added.");
     }
	}
	
	
	
	//PIM validating below tabs are present in PIM page.
	public void PIM_module_validating() {
		report = extent.createTest("verify PMI_ Moudle_page").assignDevice("windoes");
		   report.info("Testing the PMI_Moudle_Page ");
		  
		   
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		try {
		username.sendKeys(userid());
		password.sendKeys(password());
		logbutton.click();
		}catch (Exception e){
			report.fail("failed to login");
		}
		try {
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		Pmi.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		AddEmplo.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		FirstName.sendKeys("Mano");
		midname.sendKeys("j");
	lastname.sendKeys("kumar");
	
	Submit.click();
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		}catch(Exception e) {
			report.fail("failed to load the PIM page");
		}
		
	
	try {
		if(personaldetails.isDisplayed() && Contact_Details.isDisplayed()&& Emergency_contacts.isDisplayed()&&Dependents.isDisplayed()&&Immigration.isDisplayed()&&Job.isDisplayed()&&Salary.isDisplayed()&&TaxExemptions.isDisplayed()&&Report_to.isDisplayed()&&Qualifications.isDisplayed()&&Memberships.isDisplayed()) {
			report.pass("the user can see all the tabs present in Employee list page");
		}
		}catch (Exception e){
		  report.fail("the user cant see the tabs present in Employee list page ");
		}
	}
}
	
	
	
	
	

