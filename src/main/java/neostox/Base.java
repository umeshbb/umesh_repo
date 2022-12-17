package neostox;


import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
public class Base {
	protected  static WebDriver driver;
	public void launchbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Umesh\\Desktop\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		Reporter.log("launching browser...",true);
		
		 driver.get(Utility.readdatafrompropertyfile("url"));
		
	}
}
