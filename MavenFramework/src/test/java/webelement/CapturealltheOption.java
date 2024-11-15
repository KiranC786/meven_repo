package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturealltheOption {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://bengaluru.dcourts.gov.in/case-status-search-by-case-number/");
	
	if( driver.findElement(By.xpath("//input[@value='courtComple')]")).isSelected());
	System.out.println("");
	
	
	
	
	
	
	
}
}
