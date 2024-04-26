package ishahomes.utlities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TC1_DriverSetup {
	public static WebDriver driver;
	public static String url ="https://ishahomes.com/";
	public static String browsertype;
	public static WebDriver driverInstantiate(String browser) {
		browsertype = browser;
		if (browsertype.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();	
//		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);		
		return driver;
	}
	public static void driverTearDown() {
		driver.quit();
	}
	
	

}
