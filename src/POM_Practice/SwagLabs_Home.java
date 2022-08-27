package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs_Home {
	
	// Declaration
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[1]")private WebElement BagName;
	
	// initialization
	
	public SwagLabs_Home(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	// Utilization
	
	public void verifyname() {
	
	String expName="Sauce Labs Backpack";
	
	String actname = BagName.getText();
	
	if(actname.equals(expName)) {
		
		System.out.println(" TEST CASE IS PASS");
	}
	
	else {
		
		System.out.println(" TEST CASE IS PASS");
	}
	
	
	
	

}}
