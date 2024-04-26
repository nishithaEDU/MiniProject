package ishahomes.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TC3_completedProjectS {
	public static WebElement element = null;
	public static WebDriver driver;
	public static List<WebElement> count(WebDriver driver){
		List<WebElement>count_complete = driver.findElements(By.xpath("//div[@class='elementor-element elementor-element-97dc427 elementor-widget elementor-widget-houzez_elementor_property-card-v6']//a[contains(text(),'Isha')]"));
		return count_complete;
		
	}
	public static WebElement enquire(WebElement driver) {
		element = driver.findElement(By.xpath("//a[normalize-space()='Enquire Now']"));
		return element;
	}
	public static WebElement contactUs(WebElement driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Contact Us')]"));
		return element;
	}
	public static WebElement contactUsClick(WebElement driver) {
		element = driver.findElement(By.xpath("//span[normalize-space()='Contact Us']"));
		return element;
	}
	
	

}
