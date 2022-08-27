package POM_WIth_PAGEFACTORY_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_Home_page {
	
	// Declaration 
	
	@FindBy(xpath="//h1[.='Dashboard']")private WebElement name;

;
	
	
	// Initialization
	
	public Orange_Home_page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	// Utilization
	
	public void verifyuserid(String expTname) {
		
		String actname = name.getText();
		
		if(actname.equals(expTname)) {
			
			System.out.println("TC IS PASS");
		}
		
		else {
			
			System.out.println("TC IS FAIL");
		}
		
		
		
		
		
	}
	
	
	

}
