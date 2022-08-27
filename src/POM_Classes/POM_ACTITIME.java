package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_ACTITIME {
	
	// Step 1 Declaration
	
	@FindBy(xpath="//input[@id='username']") private WebElement UN;
	
	@FindBy(xpath="//input[@name='pwd']") private WebElement PWD;
	
	@FindBy(xpath="//div[.='Login ']") private WebElement LoginBTN;
	
	
	// Step 2 Initialization
	
	
	public POM_ACTITIME(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	// Step 3 Implementation
	
	
	public void UN() {
		
		UN.sendKeys("admin");
	}
	
	public void PWD() {
		
		PWD.sendKeys("manager");
	}
	
	public void LoginBTN() {
		
		LoginBTN.click();
	}
	

}
