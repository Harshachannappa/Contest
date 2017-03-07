package pageobjects;
import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class AutomationHomePage extends BaseClass{

	public AutomationHomePage(WebDriver driver){
		super(driver);
	}    

	
	@FindBy(how=How.XPATH, using="//*[@id='sdHeader']/section/div/span[5]/span[1]/button")
	public static WebElement sign_in;
	
	@FindBy(how=How.XPATH, using="//*[@id='login-register-modal']/div[2]/div[2]/div[2]/div")
	public static WebElement sign_in1;
	
	@FindBy(how=How.LINK_TEXT, using="Logout")
	public static WebElement sign_out;
		
	
	
		@FindBy(how=How.LINK_TEXT, using="Computers, Office & Gaming")
		public static WebElement COG;
		
		@FindBy(how=How.PARTIAL_LINK_TEXT, using="External Hard Drives")
		public static WebElement Externaldrive;
		
		@FindBy(how=How.XPATH, using="//*[@id='content_wrapper']/div[2]/div[3]/div[1]/div/div[2]/div[2]/div[3]/div/div[1]/label")
		public static WebElement Filter1;
		
		@FindBy(how=How.XPATH, using="//*[@id='content_wrapper']/div[2]/div[3]/div[1]/div/div[2]/div[2]/div[3]/div/div[5]/label")
		public static WebElement Filter2;
		
		@FindBy(how=How.XPATH, using="//*[@id='content_wrapper']/div[2]/div[3]/div[2]/div[1]/div[1]/div[5]/label")
		public static WebElement Filter3;
		
		@FindBy(how=How.XPATH, using="//*[@id='bx-slider-left-image-panel']/li[1]/img")
		public static WebElement Snapclick;
		
		@FindBy(how=How.XPATH, using="//*[@id='close-zoom-modal']/i")
		public static WebElement Snapclick_Cls;
		
		@FindBy(how=How.XPATH, using="//section[@class='js-section clearfix']/div[@data-js-pos='8']/div[2]/a/img")
		public static WebElement Device1;		
		
		@FindBy(how=How.XPATH, using="//section[@class='js-section clearfix']/div[@data-js-pos='9']/div[2]/a/img")
		public static WebElement Device2;		
		
		@FindBy(how=How.ID, using="add-cart-button-id")
		public static WebElement add_cart;
		
		@FindBy(how=How.XPATH, using="//*[@id='sdHeader']/div[4]/div[2]/div[1]/i")
		public static WebElement Homepage;
		
		@FindBy(how=How.LINK_TEXT, using="Motors & Accessories")
		public static WebElement MA;
		
		@FindBy(how=How.PARTIAL_LINK_TEXT, using="Car Speakers")
		public static WebElement cs;
	
		@FindBy(how=How.XPATH, using="//*[@id='content_wrapper']/div[2]/div[3]/div[1]/div/div[2]/div[8]/div[3]/div/div[1]/label")
		public static WebElement csFilter1;
		
		@FindBy(how=How.XPATH, using="//*[@id='content_wrapper']/div[2]/div[3]/div[2]/div[1]/div[1]/div[6]/label")
		public static WebElement csFilter2;

		@FindBy(how=How.ID, using="cartHeader")
		public static WebElement GOcart;
		
		@FindBy(how=How.XPATH, using="//div[@class='cart-items-list clearfix']/ul/li[1]/div[4]/div")
		public static WebElement Speaker1;
		
		@FindBy(how=How.XPATH, using="//div[@class='options cart-dropdown']/ul[@data-cs='CS1']/li[2]")
		public static WebElement Speaker1_clk;
		
		
		
		@FindBy(how=How.XPATH, using="//div[@class='cart-items-list clearfix']/ul/li[2]/div[4]/div")
		public static WebElement Speaker2;
		
		
		@FindBy(how=How.XPATH, using="//*[@id='cartModal']/div[2]/div/div/div[6]/ul/li[3]/div[7]/span/i[@class='sd-icon sd-icon-delete-sign']")
		public static WebElement d1;
		
		@FindBy(how=How.XPATH, using="//*[@id='cartModal']/div[2]/div/div/div[6]/ul/li[4]/div[7]/span/i[@class='sd-icon sd-icon-delete-sign']")
		public static WebElement d2;
		
		@FindBy(how=How.XPATH, using="//*[@id='cartModal']/div[2]/div/div/div[6]/ul/li[5]/div[7]/span/i[@class='sd-icon sd-icon-delete-sign']")
		public static WebElement d3;
		
		@FindBy(how=How.XPATH, using="//*[@id='cartModal']/div[2]/div/div/div[6]/ul/li[6]/div[7]/span/i[@class='sd-icon sd-icon-delete-sign']")
		public static WebElement d4;
		
		@FindBy(how=How.XPATH, using="//*[@id='cartModal']/div[2]/div/div/div[6]/ul/li[7]/div[7]/span/i[@class='sd-icon sd-icon-delete-sign']")
		public static WebElement d5;
		
		@FindBy(how=How.XPATH, using="//*[@id='cartModal']/div[2]/div/div/div[6]/ul/li[8]/div[7]/span/i[@class='sd-icon sd-icon-delete-sign']")
		public static WebElement d6;
		
		@FindBy(how=How.XPATH, using="//*[@id='cartModal']/div[2]/div/div/div[6]/ul/li[9]/div[7]/span/i[@class='sd-icon sd-icon-delete-sign']")
		public static WebElement d7;
		
		@FindBy(how=How.XPATH, using="//*[@id='cartModal']/div[2]/div/div/div[6]/ul/li[10]/div[7]/span/i[@class='sd-icon sd-icon-delete-sign']")
		public static WebElement d8;
		
		@FindBy(how=How.XPATH, using="//div[@class='options cart-dropdown']/ul[@data-cs='CS2']/li[2]")
		public static WebElement Speaker2_clk;
		
		@FindBy(how=How.XPATH, using="//*[@class='cart-container']/div[6]/ul/li[1]/div[4]/div")
		public static WebElement GOcart1;
		
		@FindBy(how=How.XPATH, using="//*[@class='cart-container']/div[6]/ul/li[2]/div[4]/div")
		public static WebElement GOcart2;
		
		@FindBy(how=How.ID, using="checkout-continue")
		public static WebElement Checkout;
	
		@FindBy(how=How.XPATH, using="//*[@class='options cart-dropdown']/ul/li[2]")
		public static WebElement Quantity1;
		
		@FindBy(how=How.XPATH, using="//*[@class='options cart-dropdown']/ul/li[2]")
		public static WebElement Quantity2;
		
		@FindBy(how=How.XPATH, using="//*[@class='smallFont comp-checkout-header']/div/a")
		public static WebElement Finalexit;
	
		@FindBy(how=How.XPATH, using="//i[@class='sd-icon sd-icon-expand-arrow']")
		public static WebElement AccountIcon;
}
	

		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	