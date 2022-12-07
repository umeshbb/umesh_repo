package neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeostoxLoginPage {

@FindBy(id="MainContent_signinsignup_txt_mobilenumber") private WebElement mobnum;
@FindBy(xpath = "//a[@id='lnk_signup1']") private WebElement signinButton;



public NeostoxLoginPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}
	
public void sendmobnum(String mob) {
	mobnum.sendKeys(mob);
	Reporter.log("entering mobilenumber...",true);
}
	
public void clickonSignInButton() {
	signinButton.click();
	Reporter.log("clicking on sign-in button...",true);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
