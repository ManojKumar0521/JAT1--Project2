package test_cases;



import org.testng.annotations.Test;

import base_class.Base_Class;
import pages.Contact_details;
import pages.Dependents_page;
import pages.Drop_Down_validate;
import pages.Emergenc_Contact_Details;
import pages.Job_Details_PIM;
import pages.PIM_Persnal_ditails;
import pages.PIM_adding;
import pages.Search_validat;


public class Test_cases extends Base_Class {
	@Test(priority=1)
	public void TC_PIM_01_search_validat() {
		Search_validat tc = new Search_validat();
		tc.TC_PMI01_validating();
		}
	
	@Test(priority=2)
	public void Tc_PIM_Drip_down_validate() throws Exception {
		Drop_Down_validate tc= new Drop_Down_validate();
		tc.TC_PIM_Dropdown_validate();
	}
	@Test(priority=3)
	public void PIM_Adding_employee() throws Exception {
		PIM_adding pim= new PIM_adding();
	pim.PMI_adding_functon();
	}
	
	//the user should be see all the tabs present in Employee list page
	@Test(priority=4)
	public void PIM_module_validating() {
		PIM_adding pim= new PIM_adding();
		pim.PIM_module_validating();
	}
	
	//validating PIM persnal ditails
	@Test(priority=5)
	public void PIM_personal_ditials() throws Exception {
		PIM_Persnal_ditails pim= new PIM_Persnal_ditails();
		pim.PIM_persnal_ditails();
	}
	
	//validation PIM contact_details
	@Test(priority=6)
	public void PIM_contact_details() {
		Contact_details pim= new Contact_details();
		pim.PIM_contact_details();
	}
	
	//validating PIM Emergence contact details
	@Test(priority=7)
	public void PIM_Emergence_contact_detail() {
		Emergenc_Contact_Details pim=new Emergenc_Contact_Details();
		pim.PIM_Emergenc_details();
	}
	//validating PIM Dependents_page
	@Test(priority=8)
	public void PIM_Dependents_page() {
		Dependents_page pim=new Dependents_page();
		pim.PIM_Dependents();
	}
	
	//validating PIM job details
	@Test(priority=9)
	public void Job_details_PIM() {
		Job_Details_PIM pim= new Job_Details_PIM();
		pim.Job_details();
	}
	 // validating Pim job_terminati;
	@Test(priority=10)
	public void job_terminati() throws InterruptedException {
		Job_Details_PIM pim= new Job_Details_PIM();
		pim.job_terminati();
		
	}
	// Activate Employee 
	@Test(priority=11)
	public void Job_Activate_Employee() throws Exception {
		Job_Details_PIM pim= new Job_Details_PIM();
		pim.Activate_employee();
	}
	
	//salary_details()
	@Test(priority=12)
	public void salary_details() {
		Job_Details_PIM pim= new Job_Details_PIM();
		pim.salary_details();
	}
	// Tax Exeptions
	@Test (priority=13)
	public void Tax_Exeptions() {
		Job_Details_PIM pim= new Job_Details_PIM();
		pim.tax_exeptions();
		
	}
	
	
	
	
}


