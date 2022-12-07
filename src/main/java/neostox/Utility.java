package neostox;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {

	
	
	
	public static String readdatafrompropertyfile(String key) throws IOException {
		Properties prop=new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\Umesh\\eclipse-workspace\\09JulMaven1\\src\\main\\java\\neostox\\neostox.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
	Reporter.log("reading "+key+" from properties file ",true);
		return value;
		
	}
	
	public static void wait(WebDriver driver,int waitTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		Reporter.log("waiting for..."+waitTime+"ms",true);
	}
	
	
public static void scroll(WebDriver driver,WebElement element) {
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()",element);
	
	Reporter.log("scrolling to element",true);
}
	
public  static void screenshot( WebDriver driver, String str) throws IOException {
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest =new File("C:\\Users\\Umesh\\Desktop\\selenium\\screesnhot\\"+str+".jpg");
	 FileHandler.copy(src, dest);
	 Reporter.log("takingscreenshot...",true);
}

	
	
	
	
	
	
	
	
}
