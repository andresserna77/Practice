package practice.steps;

import net.thucydides.core.annotations.Step;
import practice.pageobjects.VacationsManagement;

public class PracticeSteps {

	VacationsManagement vacationsManagement;
	
	@Step
	public void login(String struser, String strpass) {
		//Open web browser
		vacationsManagement.open();
		/*
		 * a. Input User
		 * b. Input password
		 * c. Clic in Sing In
		 */
		vacationsManagement.InputData(struser, strpass);
	
	}
	public void createemplo(){
		vacationsManagement.newemplo();
	}
		
}
