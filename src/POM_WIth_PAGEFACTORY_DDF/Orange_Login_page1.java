package POM_WIth_PAGEFACTORY_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_Login_page1 {
	
	// Declaration
	
	@FindBy(xpath="//input[@id='txtUsername']")private WebElement UN;
	
	@FindBy(xpath="//input[@id='txtPassword']")private WebElement PWD;
	
	@FindBy(xpath="//input[@id='btnLogin']")private WebElement LOGINBTN;
	
	
	// Initialization
	
	public Orange_Login_page1(WebDriver driver) {
		
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
