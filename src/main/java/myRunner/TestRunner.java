package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Selenium_Workspace\\BDDFrameWork\\src\\main\\java\\features\\dealsMap.feature",//feature files location//change faeture file name to run any particular feature
			glue={"stepDefinitions"}, //the path of the step definition files
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},//to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false//to check the mapping is proper between feature file and step def file
			//tags = {"@SmokeTest" }			//, "~@RegressionTest", "~@End2End"
			//tags = {"@SmokeTest , @RegressionTest"} , means or operator 
			)
	 
	public class TestRunner {

		public static void main(String[] args) {
			//dealsMap.feature
		}
	 
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	
