package neostoxTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neostox.Base;
import neostox.NeoStoxPasswordPage;
import neostox.NeostoxHomePage;
import neostox.NeostoxLoginPage;
import neostox.Utility;



@Listeners(neostox.Listener.class)

public class NeostoxValidateUserName extends Base{
	
	NeostoxLoginPage login;
	NeoStoxPasswordPage pass;
	NeostoxHomePage home;
	
	
	
	@BeforeClass
	public void openbrowser() throws IOException {
		launchbrowser();
		login=new NeostoxLoginPage(driver);
		pass=new NeoStoxPasswordPage(driver);
		home=new NeostoxHomePage(driver);
		
	}
	
	
	@BeforeMethod
	public void logintoNeostox() throws IOException {
		login.sendmobnum(Utility.readdatafrompropertyfile("mobnum"));
		login.clickonSignInButton();
		Utility.wait(driver, 3000);
		pass.enterpassword(Utility.readdatafrompropertyfile("password"));
		pass.clickonsubmitbutton(driver);;
		
		Utility.wait(driver, 5000);
		home.handlePopUp(driver);
		
		
	}
  @Test
  public void validateUN() throws IOException {
	  Assert.assertEquals(home.getUsername(), Utility.readdatafrompropertyfile("expun"),"TC is failed actual and expected Username are not matching");
  }
  
  @AfterMethod
  public void logout() {
	  home.logout();
  }
  
  @AfterClass
  public void closebrowser() {
	  driver.close();
	  Reporter.log("closing browser...",true);
  }
	
	
	
	
	
	
	
}
