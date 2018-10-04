package practice.steps;

import java.util.List;

import net.thucydides.core.annotations.Step;
import practice.definition.PracticeDefinition;
import practice.pageobjects.FillFormValidationPage;

public class PracticeFillFormSteps {
	FillFormValidationPage fillFormValidationPage;
	PracticeDefinition practiceDefinition;
	
	@Step
	public void fillinform(List<List<String>> data, int id) {
		fillFormValidationPage.name(data.get(id).get(0).trim());
		fillFormValidationPage.lastname(data.get(id).get(1).trim());
		fillFormValidationPage.email(data.get(id).get(2).trim());
		fillFormValidationPage.id(data.get(id).get(3).trim());
		fillFormValidationPage.leader(data.get(id).get(4).trim());
		fillFormValidationPage.year(data.get(id).get(5).trim());
		fillFormValidationPage.month(data.get(id).get(6).trim());
		fillFormValidationPage.day(data.get(id).get(7).trim());
		fillFormValidationPage.create();
		fillFormValidationPage.back();
		fillFormValidationPage.logout();
		fillFormValidationPage.publicsection();
		fillFormValidationPage.searchid(data.get(id).get(3).trim());
		fillFormValidationPage.search();
		
	}
}
