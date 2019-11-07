package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepDefinition {

	WebDriver driver;
	  
	  @Given("^user is already on Login Page$") 
	  public void user_already_on_login_page(){
		  System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe"); 
		  driver = new ChromeDriver();
		  driver.get("https://classic.crmpro.com/index.html"); 
	  }
      @When("^title of login page is Free CRM$") 
      public void title_of_login_page_is_free_CRM(){ 
    	 String title = driver.getTitle();
    	 System.out.println(title); 
    	 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
      }
      @Then("^user enters username and password$") //will fetch this info from deals.feature file
	  public void user_enters_username_and_password(DataTable credentials){
    	List<List<String>> data  = credentials.raw();
    	driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));//0th row 0th element i.e.PayalModi 
    	driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));//0th row 1st element i.e.PayalHenish
	  }
      @Then("^user clicks on login button$") 
	  public void user_clicks_on_login_button() { 
		 WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login']"));
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", loginbtn);
		// js.executeScript("arguments[0].scrollIntoView(true);", loginbtn);//+click();
	 }
      @Then("^user is on home page$")
	  public void user_is_on_hopme_page(){ 
		  String title = driver.getTitle(); 
		  System.out.println("Home Page title : "+ title);
		  Assert.assertEquals("CRMPRO", title); 
	}
	 @Then("^user moves to new deal page$")
	 public void user_moves_to_new_deal_page() {
		 driver.switchTo().frame("mainpanel");
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		 driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}
	 @Then("^user enters deal details$") //will fetch this info from deals.feature file
	 public void user_enters_contacts_details(DataTable dealData){
		 List<List<String>> dealValues  = dealData.raw();
		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));//0th row 0th element i.e.test deal
		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));//0th row 1st element i.e.1000
		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));//0th row 2nd element i.e.50
		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));//0th row 3rd element i.e.10
	}	
	 @Then("^Close the browser$") 
	  public void close_the_browser(){ 
		  driver.quit();
	  }
}