package step_definitions;

import cucumber.api.java.en.Then;
//import helpers.DataHelper;
import modules.SelectHD;
import modules.SelectSpeaker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.AutomationHomePage;
//import pageobjects.SummerDressesCatalogPage;

import java.util.HashMap;
import java.util.List;

public class Selectitems {

    public WebDriver driver;
    public List<HashMap<String,String>> datamap;


    public Selectitems()
    {
        driver = Hooks.driver;
        //datamap = DataHelper.data();
    }

    @Then("^I go to External Hard Drives section$")
    public void Harddisk() throws Throwable {

    	SelectHD.Execute(driver);

    }
    
    @Then("^I go to Motors & Accessories section$")
    public void carspeaker() throws Throwable {

    	SelectSpeaker.Execute(driver);

    }

}
