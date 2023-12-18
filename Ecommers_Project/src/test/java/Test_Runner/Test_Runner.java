package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		
		features = {"C:\\Users\\admin\\eclipse-workspace\\Ecommers_Project\\src\\test\\resources\\Feature_File"},
		dryRun = !true,
		glue = "StepDefenition",
		//snippets = SnippetType.CAMELCASE,
		monochrome = true,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	    
	     )
public class Test_Runner extends AbstractTestNGCucumberTests  {

}
