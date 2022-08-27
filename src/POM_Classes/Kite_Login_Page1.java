package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page1 {
	
	// step 1 Declaration
	
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	
	@FindBy(xpath="//button[.='Login ']")private WebElement LOGINBTN;

	
	// Step 2 Initialization
	
	public Kite_Login_Page1(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	// Utilization
	
	public void enterUN() {
		
		UN.sendKeys("DPG458");
	}
	
	public void enterPWD() {
		
		PWD.sendKeys("Amol@1234");
	}
	
	public void clickLOGINBTN() {
		
		LOGINBTN.click();
	}

		
	
		
	}


