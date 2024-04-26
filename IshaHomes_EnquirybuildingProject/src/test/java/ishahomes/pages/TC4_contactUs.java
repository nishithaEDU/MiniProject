package ishahomes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4_contactUs {
	public static WebElement element = null;
	public static WebDriver driver;
	public static WebElement email(WebElement driver) {
		element = driver.findElement(By.xpath("//a[normalize-space()='marketing@ishahomes.com']"));
		return element;
	}
	public static WebElement emailScroll(WebElement driver) {
		element = driver.findElement(By.xpath("//div[@class='elementor-column elementor-col-66 elementor-top-column elementor-element elementor-element-34d1fd3']//div[@class='elementor-widget-wrap elementor-element-populated']"));
		return element;
	}

}
