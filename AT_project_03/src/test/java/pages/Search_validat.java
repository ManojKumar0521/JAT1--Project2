package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import base_class.Base_Class;

public class Search_validat extends Base_Class{
	ExtentTest report;
	Actions act;
	@FindBy (xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy (name="password")
	WebElement password;
	@FindBy (xpath="//button[@type='submit']")
	WebElement logbutton;
	@FindBy (xpath="//span[text()='Dashboard']")
	WebElement dashboard;
	@FindBy (xpath="//p[text()='Invalid credentials']")
	WebElement invaled;
	@FindBy(xpath="//div//input[@placeholder='Search']")
	WebElement search;
	@FindBy(xpath="//a//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	WebElement Admin;
	@FindBy(xpath="//span[text()='PIM']")
	WebElement PIM;
	@FindBy(xpath="//a//span[text()='Leave']")
	WebElement Leave;
	@FindBy(xpath="//a//span[text()='Time']")
	WebElement Time;
	@FindBy(xpath="//a//span[text()='Recruitment']")
	WebElement Recruitment;
	@FindBy(xpath="//a//span[text()='My Info']")
	WebElement MY_Info;
	@FindBy(xpath="//a//span[text()='Performance']")
	WebElement Performance;
	@FindBy(xpath="//a//span[text()='Dashboard']")
	WebElement Dashboard;
	@FindBy(xpath="//a//span[text()='Directory']")
	WebElement Directory;
	@FindBy(xpath="//a//span[text()='Maintenance']")
	WebElement Maintenance;
	@FindBy(xpath="//a//span[text()='Buzz']")
	WebElement Buzz;
	
	
	public Search_validat(){
		PageFactory.initElements(driver, this);
	}
	public void TC_PMI01_validating() {
		
		report = extent.createTest("Tc_PMI_01").assignCategory("smoke").assignDevice("windoes");
	   report.info("TC_PMI_01");
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
	  driver.manage().window().maximize();
	  username.sendKeys(userid());
		password.sendKeys(password());
		logbutton.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.MINUTES);
	  
		 act= new Actions(driver);
		 
		 //Admin
	try {
		 act.moveToElement(Admin).click().build().perform();
		act.moveToElement(search).sendKeys("Admin").build().perform();
		
		if(Admin.isDisplayed()) {
			report.pass("search text box is icon is displayed in Admin homepage");
		}else {report.fail("Admin icon is not displayed");
		}
		act.moveToElement(search).sendKeys("admin").build().perform();
		if(Admin.isDisplayed()) {
			report.pass("by search in lower case also displayed");
		}else {report.fail("Admin icon is not displayed");
	    }
        
	  //PIM
	act.moveToElement(search).sendKeys("PIM").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("PIM icon is displayed");
	}else {report.fail("pim icon is not displayed");
	}
	act.moveToElement(search).sendKeys("pmi").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("by search in lower case also displayed");
	}else {report.fail("pim icon is not displayed");
	}
	//leave
	act.moveToElement(search).sendKeys("Leave").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("Leave icon is displayed");
	}else {report.fail("leave icon is not displayed");
	}
	act.moveToElement(search).sendKeys("leave").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("by search in lower case leave also displayed");
	}else {report.fail("leave is not displayed");
	}
	//Time
	act.moveToElement(search).sendKeys("Time").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("Time icon is displayed");
	}else {report.fail("Time icon is not displayed");
	}
	act.moveToElement(search).sendKeys("time").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("by search in lower case time also displayed");
	}else {report.fail("time is not displayed");
	}
	//Recruitment
	act.moveToElement(search).sendKeys("Recruitment").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("Recruitment icon is displayed");
	}else {report.fail("Recruitment icon is not displayed");
	}
	act.moveToElement(search).sendKeys("recruitment").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("by search in lower case recruitment also displayed");
	}else {report.fail("Recruitment is not displayed");
	}
	//MY Info
	act.moveToElement(search).sendKeys("MY Info").build().perform();
	if(Admin.isDisplayed()) {
		report.pass(" MY INfo icon is displayed");
	}else {report.fail("MY Info is not displayed");
	}
	act.moveToElement(search).sendKeys("my info").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("by search in lower case my info also displayed");
	}else {report.fail("my info is not displayed");
	}
	//performance
	act.moveToElement(search).sendKeys("Performance").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("perfomence icon is displayed");
	}else {report.fail("perfomence is not displayed");
	}
	act.moveToElement(search).sendKeys("perfomence").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("by search in lower case perfomence also displayed");
	}else {report.fail("perfomence is not displayed");
	}
	//Dashboard
	act.moveToElement(search).sendKeys("Dashboard").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("Dashbord icon is displayed");
	}else {report.fail("Dashbord is not displayed");
	}
	act.moveToElement(search).sendKeys("dashbord").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("by search in lower case dashbord also displayed");
	}else {report.fail("dshbord is not displayed");
	}
	//Directory
	act.moveToElement(search).sendKeys("Directory").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("Directory icon is displayed");
	}else {report.fail("directory is not displayed");
	}
	act.moveToElement(search).sendKeys("directory").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("by search in lower case directory also displayed");
	}else {report.fail("directory is not displayed");
	}
	//Maintenance
	act.moveToElement(search).sendKeys("Maintenance").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("Maintenance icon is displayed");
	}else {report.fail("Maintenance is not displayed");
	}
	act.moveToElement(search).sendKeys("maintenance").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("by search in lower case maintenance also displayed");
	}else {report.fail("Maintenance is not displayed");
	}
	//Buzz
	act.moveToElement(search).sendKeys("Buzz").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("Buzz icon is displayed");
	}else {report.fail("Buzz is not displayed");
	}
	act.moveToElement(search).sendKeys("buzz").build().perform();
	if(Admin.isDisplayed()) {
		report.pass("by search in lower case buzz also displayed");
	}else {report.fail("Buzz is not displayed");
	}
	}catch(Exception e) {
		report.fail("home page is not loaded yet");
		
	}
}
}

