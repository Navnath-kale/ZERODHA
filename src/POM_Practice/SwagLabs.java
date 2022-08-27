package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs {
	
	// Declaration 
	
	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	
	@FindBy(xpath="//input[@id='login-button']")private WebElement LOGINBTN;
	
	
	//  Initialization
	
	public SwagLabs(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Utilization
	
	public void enterUN() {
		
		UN.sendKeys("standard_user");
	}
	
	public void enterPWD() {
		
		PWD.sendKeys("secret_sauce");
	}
	
	public void clickLOGINBTN() {
		
		LOGINBTN.click();
		
		
	}
	
	

}
