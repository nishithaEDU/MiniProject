package ishahomes.utlities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class TC5_ScreenShot {
	static WebDriver driver;
	//static int i=1;
	
	

	public static void takeScreenShot(WebDriver driver) throws IOException {
		File scrFile;
		scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File(".\\Screenshots\\result1.png"));
		//i++;
		System.out.println("Screenshot has been captured!");
	}

}
