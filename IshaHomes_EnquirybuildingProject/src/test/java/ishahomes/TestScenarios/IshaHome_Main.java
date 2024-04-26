package ishahomes.TestScenarios;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ishahomes.utlities.TC1_DriverSetup;
import ishahomes.utlities.TC5_ScreenShot;

public class IshaHome_Main extends TC1_DriverSetup
{
	public static String browser ="Chrome";
	public static List<WebElement>count;
	public static WebDriver driver;
	public static WebElement liveChat,closeIndicator,completedProject,email,emailScroll,enquire,contactUs,contactUsClick;

	 public static void driverconfig(String browser)
	 {
		 driver=TC1_DriverSetup.driverInstantiate(browser);   
	 }
	 
	 public static void closeLiveChat() throws InterruptedException 
	 {
		 driver.findElement(By.xpath("//a[@id='livchat_close']")).click();
		 driver.manage().window().maximize();
		 //Thread.sleep(3000);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	
	 
	 public static void closeIndicator() 
	 {
		 
		 driver.findElement(By.xpath("//a[@class='close-indicator']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 
	 public static void clickCompleteProject() 
	 {
		 driver.findElement(By.xpath("//li[@id='menu-item-25810']//a[contains(@class,'nav-link')][normalize-space()='Completed Projects']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 
	 public static void scrollDown1() 
	 {
		 JavascriptExecutor js=(JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 
	 public static void printProject() {
		 List<WebElement> completed_Projects=driver.findElements(By.xpath("//div[@class='elementor-element elementor-element-97dc427 elementor-widget elementor-widget-houzez_elementor_property-card-v6']//a[contains(text(),'Isha')]"));
		System.out.println("Completed Projects: "+completed_Projects.size());
		System.out.println("The names of the first five completed projects are:");
		for(int i=0; i<5; i++) {
			System.out.println(completed_Projects.get(i).getText());
		}
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	 public static void scrollUp() 
	 {
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	 }
	 
	 public static void stopAt() 
	 {
		WebElement element1 = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-97dc427 elementor-widget elementor-widget-houzez_elementor_property-card-v6']//a[contains(text(),'Isha Anandham')]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element1);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	 public static void enquireClick() 
	 {
		 driver.findElement(By.xpath("//a[normalize-space()='Enquire Now']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	 public static void scrollDown2() 
	 {
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	 public static void verifyButton() 
	 {
		 String exp_result="";
			String act_result="CONTACT US";
		    exp_result=driver.findElement(By.xpath("//span[contains(text(),'Contact Us')]")).getText();
		    if(exp_result.equalsIgnoreCase(act_result)) 
		    {
		    	System.out.println("CONTACT US is displayed on the page");
		    }
		    else
		    {
		    	System.out.println("CONTACT US is not displayed on the page");
		    }
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	 public static void clickContactUs() 
	 {
		 driver.findElement(By.xpath("//span[normalize-space()='Contact Us']")).click();    
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	 public static void printEmail() 
	 {
		 WebElement flag=driver.findElement(By.xpath("//a[normalize-space()='marketing@ishahomes.com']"));
		 System.out.println("The email address is displayed below :");
		 System.out.println(flag.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	 public static void captureScreenShot() throws IOException {
		 WebElement email = driver.findElement(By.xpath("//div[@class='elementor-column elementor-col-66 elementor-top-column elementor-element elementor-element-34d1fd3']//div[@class='elementor-widget-wrap elementor-element-populated']"));
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", email);
		 TC5_ScreenShot.takeScreenShot(driver);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	 }
	 public static void closeBrow()
	    {
		 driverTearDown();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	 
	 
	 
	 
	 
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		driverconfig( browser);
		Thread.sleep(1000);
		closeLiveChat();
		Thread.sleep(1000);
		closeIndicator();
		Thread.sleep(1000);
		clickCompleteProject();
		Thread.sleep(1000);
		scrollDown1();
		Thread.sleep(1000);
		printProject();
		Thread.sleep(1000);
		scrollUp();
		Thread.sleep(1000);
		stopAt();
		Thread.sleep(1000);
		enquireClick();
		Thread.sleep(1000);
		scrollDown2();
		Thread.sleep(1000);
		verifyButton();
		Thread.sleep(1000);
		clickContactUs();
		Thread.sleep(1000);
		printEmail();
		Thread.sleep(1000);
		captureScreenShot();
		Thread.sleep(1000);
		closeBrow();
		
	}

}
