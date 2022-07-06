package tests;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resources.Base;

public class CheckoutTest extends Base {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws IOException {
		driver=initializeBrowser();
		
	    driver.get(prop.getProperty("url"));
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	


	@Test(priority=1)
	public void ValidAddress() {
		
		
		
		driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("validusername"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
		driver.findElement(By.cssSelector("#login-button")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(".title")).isDisplayed());
		driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		driver.findElement(By.cssSelector("#checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.id("last-name")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.id("postal-code")).sendKeys(prop.getProperty("postalcode"));
		driver.findElement(By.cssSelector("#continue")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(".cart_desc_label")).isDisplayed());
		
		
		
	}
	
	@Test(priority=2)
	public void EmptyAddress() {
		
		
		
		driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("validusername"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
		driver.findElement(By.cssSelector("#login-button")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(".title")).isDisplayed());
		driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		driver.findElement(By.cssSelector("#checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.id("last-name")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.cssSelector("#continue")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed());
	}
	
	@Test(priority=3)
	public void ShippingPriceTax() {
		
		
		
		driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("validusername"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
		driver.findElement(By.cssSelector("#login-button")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(".title")).isDisplayed());
		driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		driver.findElement(By.cssSelector("#checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.id("last-name")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.id("postal-code")).sendKeys(prop.getProperty("postalcode"));
		driver.findElement(By.cssSelector("#continue")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(".summary_tax_label")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.cssSelector(".summary_total_label")).isDisplayed());
     }
	
	@Test(priority=4)
	public void EmptyCartcheckout() {
		
		
		
		driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("validusername"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
		driver.findElement(By.cssSelector("#login-button")).click();
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		driver.findElement(By.cssSelector("#checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.id("last-name")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.id("postal-code")).sendKeys(prop.getProperty("postalcode"));
		driver.findElement(By.cssSelector("#continue")).click();
		driver.findElement(By.cssSelector("#finish")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(".complete-header")).isDisplayed());
		
	}
	
	@Test(priority=5)
	public void Successfullcheckout() {
		
		
		
		driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("validusername"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("validpassword"));
		driver.findElement(By.cssSelector("#login-button")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(".title")).isDisplayed());
		driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		driver.findElement(By.cssSelector("#checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.id("last-name")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.id("postal-code")).sendKeys(prop.getProperty("postalcode"));
		driver.findElement(By.cssSelector("#continue")).click();
		driver.findElement(By.cssSelector("#finish")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector(".complete-header")).isDisplayed());
		
	}
	
}
