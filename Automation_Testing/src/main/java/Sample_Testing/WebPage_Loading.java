package Sample_Testing;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebPage_Loading {


    public static void main(String[] args) throws InterruptedException {
    	
    	
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver(); 
    	
    	
    	driver.get("https://github.com/");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/a")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("login_field")).sendKeys("harikaran289@gmail.com");
    	driver.findElement(By.id("password")).sendKeys("Itsmehari@23");
    	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[3]/main/div/div[4]/form/div/input[12]")).click();
    
    	
    	
    	
    	
    	Thread.sleep(8000);
    	
    	driver.close();
    	
    }

}