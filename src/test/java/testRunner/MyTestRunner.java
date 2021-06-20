package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources"},
		glue = {"stepDefinitions", "appHooks"},
	//  tags= "@Regression",
	//	tags= "@Regression or @Smoke or @Prod" ,
	//	tags= "@Regression and @Smoke" ,
	//  tags= "not @Skip" ,
	//	tags= "@All" ,
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	//			"timeline:test-output-thread/",
				"json:target/json-report/cucumber.json"},
	//	publish=true,  //to generate cucumber report
	//	dryRun=true  //if there is any step for which step definition is not written,it will highlight in console  
			monochrome=true

)
		
public class MyTestRunner {

}
