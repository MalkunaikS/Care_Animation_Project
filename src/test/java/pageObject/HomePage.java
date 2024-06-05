package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//a[@value='2']")
	WebElement lnk_lang;
	
	@FindBy(xpath = "//button[@id='btnLogin']")
	WebElement btn_login;
	
	public void clicklang() 
	{
		lnk_lang.click();
	}
	
	public void clicklogin() 
	{
		btn_login.click();
	
	}
	
	
}
