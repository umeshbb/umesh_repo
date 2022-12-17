package neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeostoxHomePage {

	
	@FindBy(xpath = "//span[@id='lbl_username']") private WebElement username;
	@FindBy(xpath = "//span[@id='lbl_curbalancetop']") private WebElement availablebal;
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logout;
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement popUpOkButton;
	@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement popupclosebutton;
public NeostoxHomePage(WebDriver driver)	{
	PageFactory.initElements(driver, this);
}
	
public  String getUsername() {
	String actualUn = username.getText();
	return actualUn;
}
	
public String getBalence() {
	String fundsavialble = availablebal.getText();
	return fundsavialble;
}
	public void handlePopUp(WebDriver driver) {
		Reporter.log("handling popup...",true);
		Utility.wait(driver, 2000);
		popUpOkButton.click();
		Reporter.log("clicking on ok button...",true);
		Utility.wait(driver, 5000);
		Utility.scroll(driver, popupclosebutton);
		popupclosebutton.click();
		Reporter.log("clicking on close button...",true);	
	}
	
	
	public void logout() {
		
		username.click();
		logout.click();
		Reporter.log("loging out ...",true);
	}
	
	
	
	
	
	
	
	
	
	
}
