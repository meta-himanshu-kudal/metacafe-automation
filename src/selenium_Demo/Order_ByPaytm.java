package selenium_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Order_ByPaytm {

	public static void main(String[] args) throws InterruptedException{
		 //launching  chrome
		 System.out.println("Execution after setting ChromeDriver path in System Variables");
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");                
		 ChromeOptions options = new ChromeOptions();

		 options.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver = new ChromeDriver(options);
		  //WebDriverWait wait= new //WebDriverWait(driver,30);
		 
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 //navigating metacafe 
		  
			driver.get("https://metacafe-dev.metacube.com/");
			driver.manage().window().maximize();
			
			
			//login page functionality
			driver.findElement(By.id("username")).sendKeys("himanshu.kudal@metacube.com");
			driver.findElement(By.id("password")).sendKeys("12345678@Hk");
			driver.findElement(By.name("submit")).click();
			
			Thread.sleep(3000);
			
			
			WebElement linkByPartialTextUsingXPath = driver. findElement(By. xpath("//a[contains(text(),'Metacube Buffet')]")); 
			linkByPartialTextUsingXPath. click();
			
			
			//clicking on cafeteria functionality
			//Thread.sleep(4000);   
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-vendors/div/div[2]/div[1]/div/div[2]"))).click();
			
			//Feedback functionality
			//Thread.sleep(4000); 
			//if(driver.findElement(By.xpath("/html/body/app-root/div/app-order-feedback/div/div[2]/form/div[1]/div[1]/div/div/label[2]")).isDisplayed());  
			 
			//          {  driver.findElement(By.xpath("/html/body/app-root/div/app-order-feedback/div/div[2]/form/div[1]/div[1]/div/div/label[2]")).click(); }
			//        driver.findElement(By.id("comment")).sendKeys("Testing by automation");
			//      driver.findElement(By.xpath("/html/body/app-root/div/app-order-feedback/div/div[2]/form/div[4]/div/button")).click();
			             
			
			//Thread.sleep(3000);           
			//clicking on redpepper functionality
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-vendors/div/div[2]/div[1]/div/div[1]"))).click();
			/*Thread.sleep(3000); 
			 if(driver.findElement(By.xpath("/html/body/app-root/div/app-order-feedback/div/div[2]/form/div[1]/div[1]/div/div/label[2]")).isDisplayed());  
			 
			             {  driver.findElement(By.xpath("/html/body/app-root/div/app-order-feedback/div/div[2]/form/div[1]/div[1]/div/div/label[2]")).click(); 
			             driver.findElement(By.id("comment")).sendKeys("Testing by automation");
			             driver.findElement(By.xpath("/html/body/app-root/div/app-order-feedback/div/div[2]/form/div[4]/div/button")).click(); }
			             */
			//Product Selection functionality
			             Thread.sleep(3000);            
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"0\"]/div/div[1]/div/div[2]/div[2]/div[2]"))).click();
			 
			//Increase Item Quantity functionality
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,\"fa fa-plus\")]"))).click(); 
			 
		    //Go to cart functionality
			 Thread.sleep(2000); 
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-place-order/div/div[3]/div/div/div[2]"))).click();
			 
			 //check for duplicate items:
			 Thread.sleep(4000); 
			 if(driver.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).isDisplayed());  
			 
			             {  driver.findElement(By.xpath("/html/body/div/div/div[6]/button[1]")).click(); }
			             
			 //No duplicate Items
			 //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"0\\\"]/div/div[4]/div/div[2]/div[2]/div[2]/span"))).click();
			
				
			 
			//Order checkout Functionality
		   Thread.sleep(3000);	             
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-checkout/form/div/div/div[2]/div/div/div[4]/div/button"))).click();
           
             //Order by paytm
           Thread.sleep(4000);
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkout-nb\"]/div/label/div"))).click();
			           
			 //Select bank
           Thread.sleep(2000);
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ptm-nb-inner\"]/div[2]/div[1]/p"))).click();
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkout-button\"]/button"))).click();   
           
           //Transaction verify
           Thread.sleep(2000);
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div/div/button[2]"))).click();
           
        
              }
		


}
