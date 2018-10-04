package practice.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FillFormValidationPage extends PageObject{
	//***** Objects List *****
	
	//First Name
	@FindBy(xpath="//*[@id=\"employee_first_name\"]")
	public WebElementFacade txtName;
	
	//Last Name
	@FindBy(xpath="//*[@id=\"employee_last_name\"]")
	public WebElementFacade txtLastName;
	
	//Email
	@FindBy(xpath="//*[@id=\"employee_email\"]")
	public WebElementFacade txtEmail;
	
	//Identification
	@FindBy(xpath="//*[@id=\"employee_identification\"]")
	public WebElementFacade txtId;
	
	//Leader Name
	@FindBy(xpath="//*[@id=\"employee_leader_name\"]")
	public WebElementFacade txtLeader;
	
	//Year
	@FindBy(xpath="//*[@id=\"employee_start_working_on_1i\"]")
	public WebElementFacade drpYear;
	
	//Month
	@FindBy(xpath="//*[@id=\"employee_start_working_on_2i\"]")
	public WebElementFacade drpMonth;
	
	//Day
	@FindBy(xpath="//*[@id=\"employee_start_working_on_3i\"]")
	public WebElementFacade drpDay;
	
	//Create Employee Button
	@FindBy(xpath="//*[@id=\"new_employee\"]/div[8]/input")
	public WebElementFacade btnCreate;
	
	//Link Back
	@FindBy(xpath="//*[@id=\"content\"]/a[3]")
	public WebElementFacade lnkBack;
	
	//Ling LogOut
	@FindBy(xpath="//*[@id=\"user_information\"]/span/a")
	public WebElementFacade lnkLogOut;
	
	//Public Section
	@FindBy(xpath="//*[@id=\"content\"]/p/a")
	public WebElementFacade lnkPublic;
	
	//Search ID
	@FindBy(xpath="//*[@id=\"employee_identification\"]")
	public WebElementFacade txtSearchid;
	
	//Search Id Button
	@FindBy(xpath="//*[@id=\"new_employee\"]/div[3]/input")
	public WebElementFacade btnSearch;
	
	
	
	
	//***** Methods List *****
	
	public void name(String datafield) {
		txtName.click();
		txtName.clear();
		txtName.sendKeys(datafield);
	}
	
	public void lastname(String datafield) {
		txtLastName.click();
		txtLastName.clear();
		txtLastName.sendKeys(datafield);
	}
	
	public void email(String datafield) {
		txtEmail.click();
		txtEmail.clear();
		txtEmail.sendKeys(datafield);
	}
	
	public void id(String datafield) {
		txtId.click();
		txtId.clear();
		txtId.sendKeys(datafield);
	}
	
	public void leader(String datafield) {
		txtLeader.click();
		txtLeader.clear();
		txtLeader.sendKeys(datafield);
	}
	
	public void year(String datafield) {
		drpYear.click();
		drpYear.selectByValue(datafield);
	}
	
	public void month(String datafield) {
		drpMonth.click();
		drpMonth.selectByValue(datafield);
	}
	
	public void day(String datafield) {
		drpDay.click();
		drpDay.selectByValue(datafield);
	}
	
	public void create() {
		btnCreate.click();
	}
	
	public void back() {
		lnkBack.click();
	}
	
	public void logout() {
		lnkLogOut.click();
	}
	
	public void publicsection() {
		lnkPublic.click();
	}
	
	public void searchid(String datafield) {
		txtSearchid.click();
		txtSearchid.clear();
		txtSearchid.sendKeys(datafield);
	}
	
	public void search() {
		btnSearch.click();
	}
}
