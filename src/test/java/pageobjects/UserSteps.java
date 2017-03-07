package pageobjects;

import org.openqa.selenium.WebDriver;
import java.sql.Driver;

import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;


public class UserSteps extends AutomationHomePage {
	public WebDriver driver;
	public UserSteps(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void click_on_login(){
		AutomationHomePage.sign_in.click();
	}
	
	

}
