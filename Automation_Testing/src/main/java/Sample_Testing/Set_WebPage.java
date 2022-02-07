package Sample_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Set_WebPage {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		
		
		
	}
	

}
