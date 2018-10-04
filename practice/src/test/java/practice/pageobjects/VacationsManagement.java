package practice.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://vacations-management.herokuapp.com/users/sign_in") 

public class VacationsManagement extends PageObject{
	
	//***** Objects List *****
	
	//User Field
	@FindBy(xpath="//*[@id=\"user_email\"]")
	public WebElementFacade txtUsername;
	
	//Password Field
	@FindBy(xpath="//*[@id=\"user_password\"]")
	public WebElementFacade txtPassword;
	
	//Sign In Button
	@FindBy(className="submit")
	public WebElementFacade btnSignin;
	
	//Create New Employee Button
	@FindBy(xpath="//A[contains(text(),\"Create a new employee\")]")
	public WebElementFacade lnkNewEmplo;
	
	//Input Data Method
	public void InputData(String strUser, String strPass) {
		txtUsername.sendKeys(strUser);
		txtPassword.sendKeys(strPass);
		btnSignin.click();
	}
	

	//***** Methods *****
	
	//Clic New Employee Method
	public void newemplo() {
		lnkNewEmplo.click();
	}
	
}
