package step_definitions;


import cucumber.api.java.en.Then;
import helpers.DataHelper;
import modules.VerifyShoppingCartSummaryAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.AutomationHomePage;

import java.util.HashMap;
import java.util.List;

public class ShoppingCartSummarySteps {

    public WebDriver driver;
    

    @Then("^I verify details on shoppingCart$")
    public void shoppingCart() throws Throwable {
    	
        //PageFactory.initElements(driver, ShoppingCartSummaryPage.class);
        VerifyShoppingCartSummaryAction.Execute(driver);
        Thread.sleep(1000);

    }

}
