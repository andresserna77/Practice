package practice.definition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import practice.steps.PracticeFillFormSteps;
import practice.steps.PracticeSteps;
import net.thucydides.core.annotations.Steps;
public class PracticeDefinition {
	
	@Steps
	PracticeSteps practiceSteps;
	
	@Steps
	PracticeFillFormSteps practiceFillFormSteps;
	
	@Given("^Login with user \"([^\"]*)\" and pass \"([^\"]*)\"$")
	public void login_with_user_and_pass(String user, String password) {
		practiceSteps.login(user, password);
	}

	@Given("^Create Employee$")
	public void create_Employee() {
		practiceSteps.createemplo();
	}

	@When("^Fill in formulary$")
	public void fill_in_formulary(DataTable dtFormData ) {
		List<List<String>> data = dtFormData.raw();
		
		for(int i=1; i<data.size(); i++) {
			practiceFillFormSteps.fillinform(data, i);
		}
	}


	
	
}
