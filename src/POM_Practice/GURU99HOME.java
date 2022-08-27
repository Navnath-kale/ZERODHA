package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GURU99HOME {
	
	// declaration
	
	@FindBy(xpath="//h3[.='Login Successfully']")private WebElement name;
	
	
	// Initialization 
	
	public GURU99HOME(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	// utilization
	
	public void verifyname() {
		
		String exptxt="Login Successfully";
		
		String acttxt = name.getText();
		
		if(acttxt.equals(exptxt)) {
			
			System.out.println(" TC IS PASS");
		}
		
		else {
			
			System.out.println(" TC IS FAIL");
		}
		
	}
	
	
	

}
