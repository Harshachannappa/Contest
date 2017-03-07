package step_definitions;

import helpers.Constant;
import helpers.DataHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import modules.SignInAction;
import modules.SignoutAction;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageobjects.AutomationHomePage;
import pageobjects.BaseClass;
import pageobjects.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.InputStream;


public class ShoppingCart{
    public WebDriver driver;
//    public List<HashMap<String,String>> datamap = DataHelper.data();
    public static List<HashMap<String,String>> datamap = null;
    public XSSFWorkbook workbook;
    //String arg1;
    
    public ShoppingCart() throws IOException
    {
    	driver = Hooks.driver;
     	datamap = DataHelper.data();
    	
    }
    
    @When("^Launch Snapdeal website$")
    public void i_open_automationpractice_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.get(Constant.URL);
    	System.out.println(datamap);
    	driver.findElement(By.xpath(Constant.Skip_Pin)).click(); 
    	Thread.sleep(5000);
    }

    @And("^Log Into My account$")
    public void Log_in() throws Throwable {
    	PageFactory.initElements(driver, AutomationHomePage.class);
		PageFactory.initElements(driver, LoginPage.class);

		SignInAction.Execute(driver,datamap);		
    }
        
     
    @Then("^Logging Out of Snapdeal$")
    public void sign_out() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	SignoutAction.Execute(driver);
    	//driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow']")).click();
    	//driver.findElement(By.partialLinkText("Logout")).click();
    	//SignoutAction.Execute(driver);
    }
    
}