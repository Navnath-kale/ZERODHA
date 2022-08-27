package POM_WIth_PAGEFACTORY_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_LoginPage1 {
	
	// Declaration
	
	@FindBy(xpath="//input[@id='username']")private WebElement UN;
	
	@FindBy(xpath="//input[@name='pwd']")private WebElement PWD;
	
	@FindBy(xpath="//a[@id='loginButton']")private WebElement LOGINBTN;
	
	
	// Initialization 
	
	public Actitime_LoginPage1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	// Utilization 
	
	public void enterUN(String username) {
		
		UN.sendKeys(username);
	}
	
	public void enterPWD(String password) {
		
		PWD.sendKeys(password);
	}
	
	public void clickLOGINBTN() {
		
		LOGINBTN.click();
	}
	
	
	
	
	

}
