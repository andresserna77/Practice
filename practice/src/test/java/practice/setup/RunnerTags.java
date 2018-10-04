package practice.setup;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
		plugin		= {"pretty"},
		features	= {"src/test/resources/features/practice.feature"},
		glue		= {"practice.definition"}
		)
public class RunnerTags {

}
