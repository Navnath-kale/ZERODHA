package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class_OrangeHRM {
	
	// Step 1 Declaration
	
	@FindBy(xpath="//input[@id='txtUsername']") private WebElement UN;
	
	@FindBy(xpath="//input[@id='txtPassword']") private WebElement PWD;
	
	@FindBy(xpath="//input[@id='btnLogin']") private WebElement LOGINBTN;
	
	// Step 2 Initialization
	
	public  POM_Class_OrangeHRM(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
		
		
		
	// Step 3 Utilization
		
		public void enterUN() {
			
			UN.sendKeys("Admin");
		}
		
		public void enterPWD() {
			
			PWD.sendKeys("admin123");
		}
		
		public void clickLOGINBTN() {
			
			LOGINBTN.click();
		}

			
		
			
		}

