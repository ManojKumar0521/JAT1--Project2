package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import base_class.Base_Class;

public class Job_Details_PIM  extends Base_Class{
	ExtentTest report;
	JavascriptExecutor jes= (JavascriptExecutor)driver;
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
	
	
	@FindBy(xpath="//div//a[text()='Job']")
	WebElement Job;
	@FindBy(xpath="//form//label[text()='Joined Date']//following::div[1]")
	WebElement joined_date;
	@FindBy(xpath="//div//label[text()='Job Title']//following::div[1]")
	WebElement Job_Title;
	@FindBy(xpath="//div//label[text()='Job Category']//following::div[1]")
	WebElement JOB_Category;
	@FindBy(xpath="//div//label[text()='Sub Unit']//following::div[1]")
	WebElement Sub_Unit;
	@FindBy(xpath="//div//label[text()='Location']//following::div[1]")
	WebElement Location;
	@FindBy(xpath="//div//label[text()='Employment Status']//following::div[1]")
	WebElement Employment_status;
	@FindBy(xpath="//div//p[text()='Include Employment Contract Details']//following::button[@type='submit']")
	WebElement save_button;
	
	
	@FindBy(xpath="//div//p[text()='Include Employment Contract Details']//following::button[text()=' Terminate Employment ']")
	WebElement Employment_terminate;
	@FindBy(xpath="//div//following::input[@placeholder='yyyy-mm-dd'][2]")
	WebElement terminate_date;
	@FindBy(xpath = "//div//label[text()='Termination Reason']//following::div[@Tabindex='0']")
	WebElement Terminate_reason;
	@FindBy(xpath="//div//label[text()='Note']//following::textarea[@placeholder='Type here']")
	WebElement note;
	@FindBy(xpath="//div//p[text()=' * Required']//following::button[@type='submit']")
	WebElement submit_terminate;
	@FindBy(xpath="//button[text()=' Activate Employment ']")
	WebElement Activate_Employment;
	
	@FindBy(xpath="//div//a[text()='Salary']")
	WebElement Salary;
	@FindBy(xpath="//h6[text()='Assigned Salary Components']//following::i[1]")
	WebElement Add_Salary_ASSingned_com;
	@FindBy(xpath="//div//label[text()='Salary Component']//following::div[1]")
	WebElement Salary_component;
	@FindBy(xpath="//div//label[text()='Currency']//following::div[text()='-- Select --']")
	WebElement Currency;
	@FindBy(xpath="//div//label[text()='Amount']//following::div[1]")
	WebElement Amount;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submit_salary;
	
	//Tax Exemptions
	@FindBy(xpath="//div//a[text()='Tax Exemptions']")
	WebElement TaxExemptions;
	@FindBy(xpath="//h6[text()='Federal Income Tax']//following::label[text()='Status'][1]//following::div[1]")
	WebElement Federal_Status;
	@FindBy(xpath="//h6[text()='Federal Income Tax']//following::label[text()='Exemptions'][1]//following::div[1]")
	WebElement Federal_Exemptions;
	@FindBy(xpath="//h6[text()='State Income Tax']//following::label[text()='Status'][1]//following::div[1]")
	WebElement StateIncome_Status;
	@FindBy(xpath="//h6[text()='State Income Tax']//following::label[text()='Exemptions'][1]//following::div[1]")
	WebElement StateIncome_Exemptions;
	@FindBy(xpath="//h6[text()='State Income Tax']//following::label[text()='State'][1]//following::div[1]")
	WebElement State;
	@FindBy(xpath="//h6[text()='State Income Tax']//following::label[text()='Unemployment State'][1]//following::div[1]")
	WebElement Unemployment;
	@FindBy(xpath="//h6[text()='State Income Tax']//following::label[text()='Work State'][1]//following::div[1]")
	WebElement Work_State;
	@FindBy(xpath="//h6[text()='State Income Tax']//following::label[text()='Work State'][1]//following::button[@type='submit']")
	WebElement Tax_Exemptions_save;
	
	
	public Job_Details_PIM(){
		PageFactory.initElements(driver, this);
	}
	
	public void Job_details() {
		report = extent.createTest("validating PIM JOB details").assignDevice("windoes");
		   report.info("Testing the PMI_Page job details ");
		  
		   
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
	Job.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	joined_date.sendKeys("2022-10-12");
	Actions act= new Actions(driver);
	act.moveToElement(Job_Title).click().keyDown(Keys.ARROW_DOWN).build().perform();
	act.moveToElement(JOB_Category).click().keyDown(Keys.ARROW_DOWN).build().perform();
	act.moveToElement(Sub_Unit).click().keyDown(Keys.ARROW_DOWN).build().perform();
	act.moveToElement(Location).click().keyDown(Keys.ARROW_DOWN).build().perform();
	act.moveToElement(Employment_status).click().keyDown(Keys.ARROW_DOWN).build().perform();
	save_button.click();
	jes.executeScript("arguments[0].click()", save_button);
	
	
	try {
		if(joined_date.getText().contentEquals("2022-10-12")) {
			report.pass("The user can see the filled details");
		}
	}catch (Exception e) {
		report.fail("The user failed to see the filled details");
		
	}
	}
	
	
	// job_terminati in pim job page
	public void job_terminati() throws InterruptedException {
		report = extent.createTest("validating PIM Job terminate").assignDevice("windoes");
		   report.info("Testing the PMI_Page job terminate ");
		  
		   
		   Actions act= new Actions(driver);
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
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
		Job.click();
		Thread.sleep(5000);
	   act.moveToElement(joined_date).sendKeys("2022-10-12");
		save_button.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	  Employment_terminate.click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);

	 
	 jes.executeAsyncScript("arguments[0].value='2022-10-10'",terminate_date);
	 driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);

	jes.executeScript("arguments[0].click;", Terminate_reason).wait(3000);
	 driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);


	 
	  jes.executeScript("arguments[0].click()",submit_terminate);
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
     
     if(Activate_Employment.isDisplayed()) {
    	 report.pass("the user susessfully Terminated the employee and can see the employee activeate button");
     }else {
    	 report.fail("The user failed to terminate the emplyee");
     }
	}
	
	//Activate_employeee job  pim page
	public void Activate_employee() throws InterruptedException {
		report = extent.createTest("validating PIM Job_Activate Employee").assignDevice("windoes");
		   report.info("Testing the PMI_Page job Activate employee");
		  
		   
		   Actions act= new Actions(driver);
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
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
	Job.click();
	Thread.sleep(5000);
   act.moveToElement(joined_date).sendKeys("2022-10-12");
	save_button.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
  Employment_terminate.click();
  driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);

 
 jes.executeAsyncScript("arguments[0].value='2022-10-10'",terminate_date);
 driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);

jes.executeScript("arguments[0].click;", Terminate_reason).wait(3000);
 driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);


 
  jes.executeScript("arguments[0].click()",submit_terminate);
  driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
  
  

  Activate_Employment.click();
  driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
  
  
       try{
    	   if(Employment_terminate.isDisplayed()) {
    		   
    		   report.pass("the user can see the Activation on job datiles page");
    		   
    	   }
       }catch(Exception e) {
    	   report.fail("The user can't see the Activation on job datiles page");
       }
  }
	//salary details validating 
	  
	public void salary_details() {
		report = extent.createTest("validating PIM Job_Activate Employee").assignDevice("windoes");
		   report.info("Testing the PMI_Page job Activate employee");
		  
		   
		   Actions act= new Actions(driver);
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
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
	Salary.click();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
	try {
	Add_Salary_ASSingned_com.click();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
	//Salary_component.sendKeys("akdiwefl");
	jes.executeScript("arguments[0].value='Abcdefgh'",Salary_component);
	//Select se=new Select(Currency);
	//se.selectByVisibleText("Indian Rupee");
	
	jes.executeScript("arguments[0].SelectByVisibleText='Indian Rupee'",terminate_date);
	jes.executeScript("arguments[0].value='100000'",Amount);
	//Amount.sendKeys("100000");
//Submit_salary.click();
	jes.executeScript("arguments[0].click()",Submit_salary);
report.pass("The user can able to fill all the details and click save button");
	} catch (Exception e) {
		report.fail(" failed to fill the details");
		
	}
}
	//Tax Exemptions
	
	public void tax_exeptions() {
		report = extent.createTest("validating PIM Tax Exemptions").assignDevice("windoes");
		   report.info("Testing the PMI_Page job Tax Exemptions");
		  
		   
		   Actions act= new Actions(driver);
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
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
	TaxExemptions.click();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
	jes.executeScript("arguments[0].value='77'",Federal_Exemptions);
	jes.executeScript("arguments[0].value='Single'",Federal_Status);
	jes.executeScript("arguments[0].value='Indiana", State);
	jes.executeScript("arguments[0].value='Single", StateIncome_Status);
	jes.executeScript("arguments[0].value='73", StateIncome_Exemptions);
	jes.executeScript("arguments[0].value='Indiana", Unemployment);
	jes.executeScript("arguments[0].value='Indiana", Work_State);
	
	
	try {
	jes.executeScript("arguments[0].click()", Tax_Exemptions_save);
	report.pass("The user sussefully filled the details and clicked the save button ");
	}catch(Exception e) {
		report.fail("The user con't fill the details in this Tax Exemptions page");
		
		
	}
	
	
	
	
		
	}
	
	


}
