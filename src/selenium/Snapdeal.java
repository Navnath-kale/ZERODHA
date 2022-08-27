package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(6000);
		driver.get("https://www.snapdeal.com/product/veirdo-green-half-sleeve-tshirt/639827458615");
		Thread.sleep(6000);
		driver.get("https://www.snapdeal.com/buyNow?catalogId=644357931713&vendorCode=Sf042e&vendorScore=4.2&supc=SDL302182620&quoteValue=&quoteId=&quoteProductName=&ref=BuyButton-pdpBuy");
		Thread.sleep(6000);
		driver.get("https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?client_id=36115742491-h38grsuuq7jilk484i69j84bmul8nst5.apps.googleusercontent.com&response_type=code&scope=email%20profile&redirect_uri=https%3A%2F%2Fwww.snapdeal.com%3A443%2Fj_spring_google_security_check%3Fsource%3Dgoogle&&flowName=GeneralOAuthFlow");
		Thread.sleep(6000);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2Fsignin%2Foauth%2Fconsent%3Fauthuser%3Dunknown%26part%3DAJi8hAPmUKfN0ArZsFodz0kI2mg4UHyBhCJ_awN7gBc0NWKVfp12g3IMwvbcud2SksJHTMicLMJphmtxkHMTTkXwWTjycz8AnhK_B25ODJN_wfEyx_2F8EYORvcMsykJC2DHEnnDJUr-t297QIfcTTBfhgNr81YHdRo7HWbGfu86C5OflOomGylGhTB2hoJPPgQ2XkiCi4Iz5YfXxOm3iaqDiobWelTX4E2TUBPexaBfIUBSVdDFyng9BYwb1Ucr2h3k4KgZc-_AziW61B4IRuQviLqgiRYIqgspcOdQsw8KmGUHWB-DI4NKqGSgEtLAJT1kh7yFJsWVWIx9UPCrtqBIbWsvcTEyYtchbcYb_yjJ33f4Nk3yUQRhrB3wRL_3RflnQwPlXPoss5K7eYqZ_RHCSfoAYlx4nCVN-UsP9jTJnxpeAEtukmgnHfrIWs44ehwlFtJfBfzTgD5FPQ4TxNik4MVC32tfJ5uChAB2m7tpHWJ6qsucPJw%26as%3DS-670624257%253A1656769741139896%26client_id%3D36115742491-h38grsuuq7jilk484i69j84bmul8nst5.apps.googleusercontent.com%23&signInUrl=https%3A%2F%2Faccounts.google.com%2Fsignin%2Foauth%3Fclient_id%3D36115742491-h38grsuuq7jilk484i69j84bmul8nst5.apps.googleusercontent.com%26response_type%3Dcode%26scope%3Demail%2Bprofile%26redirect_uri%3Dhttps%253A%252F%252Fwww.snapdeal.com%253A443%252Fj_spring_google_security_check%253Fsource%253Dgoogle%26&dsh=S-670624257%3A1656769741139896&flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.manage().window().minimize();
		Thread.sleep(6000);
		driver.close();
	}
	
		

}
