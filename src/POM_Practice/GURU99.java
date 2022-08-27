package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GURU99 {
	
	// Declaration 
	
	@FindBy(xpath="//input[@name='userName']")private WebElement UN;
	
	@FindBy(xpath="//input[@name='password']")private WebElement PWD;
	
	@FindBy(xpath="//input[@name='submit']")private WebElement SUBMITBTN;
	
	
	// Initialization
	
	public GURU99(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	//  Utilization
	
	public void enterUN() {
		
		UN.sendKeys("test1");
	}
	
	public void enterPWD() {
		
		PWD.sendKeys("test2");
	}
	
	public void clickSUBMITBTN() {
		
		SUBMITBTN.click();
	}
	

}
