package neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxPasswordPage {

	@FindBy(id="lnk_submitaccesspin") private WebElement submitbutton;
	@FindBy(id="txt_accesspin") private WebElement passwordfield;
	
	
	
	public NeoStoxPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterpassword(String pass) {
		passwordfield.sendKeys(pass);
		Reporter.log("entering password...",true);
	}
	
	public void clickonsubmitbutton(WebDriver driver) {
		Utility.wait(driver, 2000);
		submitbutton.click();
		submitbutton.click();
		Reporter.log("clicking on submitbutton...",true);
		
	}
	
	
	
	
	
	
	
}
