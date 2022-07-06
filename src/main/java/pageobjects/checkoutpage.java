package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutpage {
	
	WebDriver driver;
	
	public checkoutpage(WebDriver driver) {
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(id="user-name")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;
	
	public void username(String UserName) {
		username.sendKeys(UserName);
	}
	
	public void password(String PassWord) {
		password.sendKeys(PassWord);
	}
	
	
}


