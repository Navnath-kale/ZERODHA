package POM_WIth_PAGEFACTORY_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_HomePage {
	
	// Declaration
	
	@FindBy(xpath="//td[@class='pagetitle']")private WebElement Title;
	
	// Initialization
	
	public Actitime_HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	// Utilization 
	
	public void verifyTitle(String expTitle) {
		
		String actTitle = Title.getText();
		
		if(actTitle.equals(expTitle)) {
			
			System.out.println("TC IS PASS");
		}
		
		else {
			
			System.out.println("TC IS PASS");
		}
	}
	
	
	

}
