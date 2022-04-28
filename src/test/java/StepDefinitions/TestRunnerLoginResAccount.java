package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/LoginResAccount.feature",glue= {"StepDefinitions"},
monochrome=true,
plugin={"pretty","json:target/JSONReports/report.json",
		"pretty","junit:target/JUNITReports/report.xml",
		"pretty","html:target/HTMLReports/report.html"
}
)
public class TestRunnerLoginResAccount {

}
