package modules;
import static org.testng.AssertJUnit.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import helpers.Constant;
import helpers.DataHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.imageio.ImageIO;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.awt.image.BufferedImage;
import java.awt.Image;

import pageobjects.AutomationHomePage;
//import pageobjects.SummerDressesCatalogPage;
public class SelectHD {
   
	@SuppressWarnings("deprecation")
	public static void Execute(WebDriver driver) throws Exception{
		//WebDriverWait wait = new WebDriverWait(driver,10);
		
		
		
		AutomationHomePage.COG.click();
		//driver.findElement(By.partialLinkText("Computers, Office & Gaming")).click();
		System.out.println("Done here");
		Thread.sleep(1000);
		AutomationHomePage.Externaldrive.click();
		Thread.sleep(1000);
		AutomationHomePage.Filter1.click();
		Thread.sleep(1000);
		AutomationHomePage.Filter2.click();
		Thread.sleep(1000);
		AutomationHomePage.Filter3.click();
		Thread.sleep(1000);
		String HDPage = driver.getCurrentUrl();
		//Fetching the 10 Hard Disk
		
		for(int i=0;i<=7;i++)
		{
			String s="\""+i+"\"";
			String path_name=Constant.HDselect+s+"]/div[3]/div[1]";
			String cart = driver.findElement(By.xpath(path_name)).getText();
    	   	System.out.println(cart);
    	   	String price_value=Constant.HDselect+s+"]/div[3]/div[2]/div[1]/span[@class='product-price']";
    	   	String price=driver.findElement(By.xpath(price_value)).getText();
    	   	System.out.println(price);
    	   	DataHelper.write(i,price, cart);
    	   	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	   	driver.findElement(By.xpath(Constant.HDselect+s+"]/div[2]/a/img")).click();
    	   	if(i==0){
    			//Taking Snap for the first hard Disk
    	   		//driver.findElement(By.xpath(Constant.HDselect+s+"]/div[2]/a/img")).click();
    			Thread.sleep(2000);
    			AutomationHomePage.Snapclick.click();
    			//driver.findElement(By.xpath("//span[@class='icon-font-grey-size24 close-popup-icon']")).click();
    			Thread.sleep(4000);
    			    			
    			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    			FileUtils.copyFile(screenshot, new File("c:\\log\\screenshot.jpg"));	
    			
    			Image orig = ImageIO.read(new File("c:\\log\\screenshot.jpg"));
    			int x = 130, y = 130, w = 800, h = 800;  // define the sections to cut out
    			BufferedImage bi = new BufferedImage(w, h, BufferedImage.OPAQUE);
    			bi.getGraphics().drawImage(orig, 0, 0, w, h, x, y, x + w, y + h, null);
    			ImageIO.write(bi, "jpg", new File("c:\\log\\screenshot.jpg"));
    			//WebElement Image = driver.findElement(By.xpath("//*[@id='bxsliderModal']/li[1]/img"));
      			Thread.sleep(4000);
      			
      			AutomationHomePage.Snapclick_Cls.click();
     				}    	   	    	   			
    	   	AutomationHomePage.add_cart.click();
    	   	Thread.sleep(15000);
    	   	driver.navigate().to(HDPage);
//    }    	
    	   	//Thread.sleep(1000);
		}
		//DataHelper.write(8,Constant.Devprc1,Constant.Dev1);
		//AutomationHomePage.Device1.click();
		//AutomationHomePage.add_cart.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.navigate().to(HDPage);
		//DataHelper.write(9,Constant.Devprc2,Constant.Dev2);
		//AutomationHomePage.Device1.click();
		//AutomationHomePage.add_cart.click();
		//Thread.sleep(15000);
		//driver.navigate().to(HDPage);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Model output");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AutomationHomePage.Homepage.click();
	}
}
