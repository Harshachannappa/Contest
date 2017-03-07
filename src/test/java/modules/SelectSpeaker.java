package modules;

import pageobjects.AutomationHomePage;

import helpers.Constant;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
public class SelectSpeaker {

	@SuppressWarnings("deprecation")
	public static void Execute(WebDriver driver) throws Exception{
		AutomationHomePage.MA.click();
		//driver.findElement(By.partialLinkText("Computers, Office & Gaming")).click();
		System.out.println("Done here");
		Thread.sleep(5000);
		AutomationHomePage.cs.click();
		Thread.sleep(5000);
		AutomationHomePage.csFilter1.click();
		Thread.sleep(5000);
		AutomationHomePage.csFilter2.click();
		Thread.sleep(5000);
		String CSPage = driver.getCurrentUrl();
		for(int i=1;i<=2;i++){
	    			
	    	driver.findElement(By.xpath(Constant.CSselect+i+"]/div[2]/a/img")).click();
	    	
			AutomationHomePage.add_cart.click();		
			Thread.sleep(5000);
			driver.navigate().to(CSPage);
	    	}
	}
}
