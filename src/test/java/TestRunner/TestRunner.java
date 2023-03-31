package TestRunner;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

//dryRun = true,//

//@RunWith(CucumberOptions.class)
@RunWith(Cucumber.class)
@CucumberOptions(		
	features = {"src/test/java/features"},
	glue = {"stepDefinations" },
	//publish=true,
	tags=("@Smoke"),
	monochrome = true,
	plugin={"html:target/cucumber-html-report","pretty", "json:target/cucumber.json"})
	//plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber.json", "junit:target/cucumber.xml"})
public class TestRunner{
//	public static TestNG testNg;
//	public static void main(String[] args) throws Throwable  {
//		
//	//	Main.main(new String[]{"-g", "C:\\new_workspace\\Orange_Hrm\\src\\test\\java\\stepDefinations", "C:\\new_workspace\\Orange_Hrm\\src\\test\\java\\features\\feature1.feature"});    
////		Main.main(new String[]{
////	            "--glue",
////	            "stepDefinations",  // to used Step definitions in default package
////	            "features/feature1.feature"}
////	        );
//    //System.out.println("exitcode = " + exitcode);	
//		
//	//code to call logindemo test class from runner file.
//	testNg = new TestNG();
//	// Create a list of String 
//	List<String> suitefiles=new ArrayList<String>();
//
//	// Add xml file which you have to execute
//	suitefiles.add("C:\\new_workspace\\Orange_Hrm\\testng.xml");
//
//	// now set xml file for execution
//	testNg.setTestSuites(suitefiles);
//
//	testNg.run();
}
