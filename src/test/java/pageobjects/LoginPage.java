package pageobjects;
import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver){
		super(driver);
	}    

	/*
	
	@FindBy(id="j_username")
	public static WebElement email;
	
	@FindBy(id="j_password_login")
	public static WebElement password;
	
	@FindBy(id="signin_submit")
	public static WebElement signin_button;
	
*/
	
	@FindBy(how=How.ID, using="j_username")
	public static WebElement email;
	
	@FindBy(how=How.ID, using="j_password_login")
	public static WebElement password;
	
	@FindBy(how=How.ID, using="signin_submit")
	public static WebElement signin_button;
		
	@FindBy(how=How.ID, using="email_create")
	public static WebElement email_create;

	@FindBy(how=How.ID, using="SubmitCreate")
	public static WebElement submit_create;
	
	
		
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
