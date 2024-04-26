package ishahomes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2_HomePage {
	public static WebElement element = null;
	public static WebDriver driver;
	
	public static WebElement liveChat(WebElement driver) {
		element = driver.findElement(By.xpath("//a[@id='livchat_close']"));
		return element;
		//thread.sleep(5000);
	}
	public static WebElement closeIndicator(WebElement driver) {
		element = driver.findElement(By.xpath("//a[@class='close-indicator']"));
		return element;
	}
	public static WebElement completedProject(WebElement driver) {
		element = driver.findElement(By.xpath("//li[@id='menu-item-25810']//a[contains(@class,'nav-link')][normalize-space()='Completed Projects']"));
		return element;
	}
	

}
