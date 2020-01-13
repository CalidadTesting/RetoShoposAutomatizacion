package co.com.google.www.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/co/com/google/www/features/compra_tottus.feature",
		glue = "co.com.google.www.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		)
public class CompraTottusRunner {

}
