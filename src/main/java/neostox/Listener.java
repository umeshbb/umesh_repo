package neostox;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends Base implements ITestListener {

	
	

	public void onTestStart(ITestResult result) {
		Reporter.log("TC "+result.getName()+" execution started",true);
	}
	
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC "+result.getName()+" passed successfully",true);
	}
	
	
	public void onTestFailure(ITestResult result) {
	Reporter.log("TC "+result.getName()+" failed ",true);
	try {
		Utility.screenshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

	
}
