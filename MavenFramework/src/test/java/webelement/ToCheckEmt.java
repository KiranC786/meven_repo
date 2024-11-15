package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckEmt {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://shop-global.malaicha.com/login");
	   
	    driver.findElement(By.xpath("//input[@name='pin']"));
	    if ( driver.findElement(By.xpath("//input[@name='username']")).getAttribute("placeholder") != null ) {
			System.out.println("hai");
			
		}
	    
	}

}
