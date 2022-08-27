package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page2 {
	
	// Step 1 Declaration
	
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	
	@FindBy(xpath="//button[.='Continue ']") private WebElement CONTBUTTON;
	
	// Step 2 Initialization
	
	public Kite_Login_Page2(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Step 3 Utilization 
	
	public void enterPin() {
		
		PIN.sendKeys("171992");
		
	}
	
	public void clickCONTBUTTON() {
		
		CONTBUTTON.click();
	}
	
		
		
		
	}
	
	


