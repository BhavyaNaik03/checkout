package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.Base;

public class checkout extends Base{
	
	WebDriver driver;
	
	
	 @Given("^open the application url$")
	    public void open_the_application_url() throws IOException  {
		
		 driver=initializeBrowser();
		 driver.get(prop.getProperty("url"));
	        
	    }

	    @When("^user enters valid username and password$")
	    public void user_enters_valid_username_and_password()  {
	    	
	    	driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("validusername"));
			driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
	        
	    }

	    @When("^user enters Firstname Lastname and postalcode into the fields$")
	    public void user_enters_firstname_lastname_and_postalcode_into_the_fields()  {
			driver.findElement(By.id("first-name")).sendKeys(prop.getProperty("firstname"));
			driver.findElement(By.id("last-name")).sendKeys(prop.getProperty("lastname"));
			driver.findElement(By.id("postal-code")).sendKeys(prop.getProperty("postalcode"));
	        
	    }

	    @When("^user enters Firstname Lastname into the fields by leaving postalcode empty$")
	    public void user_enters_firstname_lastname_into_the_fields_by_leaving_postalcode_empty()  {
			driver.findElement(By.id("first-name")).sendKeys(prop.getProperty("firstname"));
			driver.findElement(By.id("last-name")).sendKeys(prop.getProperty("lastname"));
	        
	    }

	    @Then("^user should see the payment page$")
	    public void user_should_see_the_payment_page()  {
	    	Assert.assertTrue(driver.findElement(By.cssSelector(".cart_desc_label")).isDisplayed());
	    	driver.quit();
	        
	    }

	    @Then("^user should see error message$")
	    public void user_should_see_error_message()  {
	    	Assert.assertTrue(driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed());
	    	driver.quit();
	        
	    }

	    @Then("^user should see tax price and total price of the item$")
	    public void user_should_see_tax_price_and_total_price_of_the_item()  {
	    	Assert.assertTrue(driver.findElement(By.cssSelector(".summary_tax_label")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.cssSelector(".summary_total_label")).isDisplayed());
			driver.quit();
	       
	    }

	    @Then("^user should see order conformation message$")
	    public void user_should_see_order_conformation_message()  {
	    	
	    	Assert.assertTrue(driver.findElement(By.cssSelector(".complete-header")).isDisplayed());
	    	driver.quit();
	    }

	    @And("^user clicks on login button$")
	    public void user_clicks_on_login_button()  {
	    	
	    	driver.findElement(By.cssSelector("#login-button")).click();
	        
	    }

	    @And("^user add the Sauce Labs Backpack by clicking add to cart button$")
	    public void user_add_the_sauce_labs_backpack_by_clicking_add_to_cart_button()  {
	    	driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
	        
	    }

	    @And("^user clicks on shopping cart button$")
	    public void user_clicks_on_shopping_cart_button()  {
	    	driver.findElement(By.cssSelector(".shopping_cart_link")).click();
	        
	    }

	    @And("^user clicks on checkout button$")
	    public void user_clicks_on_checkout_button()  {
	    	driver.findElement(By.cssSelector("#checkout")).click();
	        
	    }

	    @And("^user clicks on continue button$")
	    public void user_clicks_on_continue_button()  {
	    	driver.findElement(By.cssSelector("#continue")).click();
	       
	    }

	    @And("^user clicks on finish$")
	    public void user_clicks_on_finish()  {
	    	driver.findElement(By.cssSelector("#finish")).click();
	        
	    }

}
