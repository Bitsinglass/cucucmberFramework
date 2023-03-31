package stepDefinations;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import io.cucumber.datatable.DataTable;
//import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;


public class LoginpageTest {
	
    @Given("^User is on Login screen of application$")
    public void user_is_on_home_screen_of_application() throws Throwable {
    	System.out.println("okokokok");
    }

    @When("^User enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enter_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("username "+strArg1);
    	System.out.println("username "+strArg2);
    }
    
    @When("^User Enters valid username \"([^\"]*)\" & Invalid password \"([^\"]*)\"$")
    public void user_enters_valid_username_something_invalid_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("username "+strArg1);
    	System.out.println("username "+strArg2);    }
    
    @Then("^Message appears on screen that Invalid credentials$")
    public void message_appears_on_screen_that_invalid_credentials() throws Throwable {
    	System.out.println("okokokok");    }

    @And("^User Clicks on Login button$")
    public void user_clicks_on_login_button() throws Throwable {
    	System.out.println("okokokok");
    }

    @When("^User Enters valid username & Invalid password$")
    public void user_enters_valid_username_invalid_password() throws Throwable {
    	System.out.println("okokokok");
    }
    
//    @When("^User Enters valid username & valid password$")
//    public void user_enters_valid_username_valid_password() throws Throwable {
//    	System.out.println("okokokok");
//    }

    @When("^User enters username and password$")
    public void user_enters_username_and_password(DataTable table) throws Throwable {
     List<List<String>> data = table.asLists(String.class);
     System.out.println("Username "+data.get(1).get(0)); //ok 
     System.out.println("Password "+data.get(1).get(1));
     //     VTigerLogin vl = new VTigerLogin(driver);
//     
//    
//     //handling data table my logic 
//     //table returning or converting to list of map of objects
//     for (Map<Object, Object> data2 : table.asMaps(String.class, String.class)) {
//    	vl.username().clear();
//       	vl.password().clear();
//       	vl.username().sendKeys(data2.get("username").toString());
//     	vl.password().sendKeys(data2.get("password").toString());
//     	vl.Login_click();  
//     	}
     }
    
    
    @Then("^User navigates to Home page$")
    public void user_navigates_to_home_page() throws Throwable {    	
    	System.out.println("okokokok");
    }
}