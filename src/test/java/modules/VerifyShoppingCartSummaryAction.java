package modules;
import helpers.Constant;
import helpers.DataHelper;
import pageobjects.AutomationHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;
public class VerifyShoppingCartSummaryAction {
    @SuppressWarnings("deprecation")
    public static void Execute(WebDriver driver) throws Exception{
    	AutomationHomePage.GOcart.click();
    	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	Thread.sleep(4000);		
    		    		
    		
    			AutomationHomePage.Speaker1.click();
    			Thread.sleep(4000);
    			AutomationHomePage.Speaker1_clk.click();
    			Thread.sleep(4000);
       			//driver.findElement(By.id("CS"+i+"")).click();
    			//driver.findElement(By.xpath("//div[@class='cart-items-list clearfix']/ul/li[1]/div[4]/div")).click();
    			//driver.findElement(By.xpath("//div[@class='options cart-dropdown']/ul[@data-cs='CS1']/li[2]")).click();
    			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		
    			AutomationHomePage.Speaker2.click();
    			Thread.sleep(4000);
    			AutomationHomePage.Speaker2_clk.click();
    			Thread.sleep(4000);
    			//driver.findElement(By.xpath("//div[@class='cart-items-list clearfix']/ul/li[2]/div[4]/div")).click();
    			//driver.findElement(By.xpath("//div[@class='options cart-dropdown']/ul[@data-cs='CS2']/li[2]")).click();
    			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		
    		
    			AutomationHomePage.d1.click();
    			Thread.sleep(4000);
    			AutomationHomePage.d2.click();
    			Thread.sleep(4000);
    			AutomationHomePage.d3.click();
    			Thread.sleep(4000);
    			AutomationHomePage.d4.click();
    			Thread.sleep(4000);
    			AutomationHomePage.d5.click();
    			Thread.sleep(4000);
    			AutomationHomePage.d6.click();
    			Thread.sleep(4000);
    			AutomationHomePage.d7.click();
    			Thread.sleep(4000);
    			AutomationHomePage.d8.click();
    			Thread.sleep(4000);
    			//driver.findElement(By.xpath(Constant.iteamdiscard+i+"]/div[7]/span/i[@class='sd-icon sd-icon-delete-sign']")).click();
    		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		
    	
    	
    	AutomationHomePage.Checkout.click();
    	Thread.sleep(1000);
    	AutomationHomePage.Finalexit.click();
    	
    }
}
