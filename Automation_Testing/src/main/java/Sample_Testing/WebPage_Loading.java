package Sample_Testing;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebPage_Loading {


    public static void main(String[] args) {
    	
    	
    	WebDriverManager.chromedriver().setup();
    	
    	
    	WebDriver driver = new ChromeDriver(); 
    	
    	
    	driver.get("https://www.youtube.com/");
    	
        
       
    }

}