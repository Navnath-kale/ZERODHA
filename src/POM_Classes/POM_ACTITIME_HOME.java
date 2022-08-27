package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_ACTITIME_HOME {
	
	// declaration
	
	@FindBy(xpath="//td[@class='pagetitle']")private WebElement name;
	
	// initialization
	
	public POM_ACTITIME_HOME(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	// utilization
	
	public void verifyname() {
		
		String exptxt="Enter Time-Track";
		
		String acttxt = name.getText();
		
		if(acttxt.equals(exptxt)) {
			
			System.out.println(" tc is pass");
		}
		
		else {
		
		System.out.println(" tc is fail");
		
		
		

	}

}}
