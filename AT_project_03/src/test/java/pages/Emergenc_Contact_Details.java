package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import base_class.Base_Class;

public class Emergenc_Contact_Details extends Base_Class {
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
	
	@FindBy(xpath="//div//a[text()='Emergency Contacts']")
	WebElement Emergency_contacts;
	@FindBy(xpath="//h6[text()='Assigned Emergency Contacts']//following::i[1]")
	WebElement Add;
	@FindBy(xpath="//div//label[text()='Name']//following::input[1]")
	WebElement Name;
	@FindBy(xpath="//div//label[text()='Relationship']//following::input[1]")
	WebElement Relationship;
	@FindBy(xpath="//div//label[text()='Home Telephone']//following::input[1]")
	WebElement Home_Telephone;
	@FindBy(xpath="//div//label[text()='Mobile']//following::input[1]")
	WebElement Mobile;
	@FindBy(xpath="//div//label[text()='Work Telephone']//following::input[1]")
	WebElement work_Telephone;
	@FindBy(xpath="//div//p//following::button[@type='submit']")
	WebElement save;
	
	
	
	
	public Emergenc_Contact_Details(){
		PageFactory.initElements(driver, this);

}
	public void PIM_Emergenc_details() {
		//Actions act= new Actions(driver);
		report = extent.createTest("validating PIM Emergence _contact ditails").assignDevice("windoes");
		   report.info("Testing the PMI_Page Emergence contact ditails ");
		  
		   
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
	 
	Emergency_contacts.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	
	Add.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	Name.sendKeys("Rohith");
	Relationship.sendKeys("Friend");
	Home_Telephone.sendKeys("1234567");
	Mobile.sendKeys("9876543210");
	work_Telephone.sendKeys("89795939");
	save.click();
	
	try {
		if(Name.getText().contentEquals("Rohith")&&Relationship.getText().contentEquals("Friend")&&
				Home_Telephone.getText().contentEquals("1234567")&&
				Mobile.getText().contentEquals("9876543210")&&
				work_Telephone.getText().contentEquals("89795939")){
					report.pass("user can see the filled details ");
				}
	}catch(Exception e) {
	  report.fail("user can't see the filled details");
	}
	
	
	
	
	
	
	
	}
}
