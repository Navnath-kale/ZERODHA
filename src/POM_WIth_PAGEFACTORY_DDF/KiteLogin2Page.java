package POM_WIth_PAGEFACTORY_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
	
	// Declaration 
	
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
	
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement CNTBTN;
	
	
	// INITIALIZATION
	
	public KiteLogin2Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Utilization
	
	public void enterPIN(String PINVALUE) {
		
		PIN.sendKeys(PINVALUE);
		
	}
	
	public void clickCNTBTN() {
		
		CNTBTN.click();
	}
	
	
	
	

}
