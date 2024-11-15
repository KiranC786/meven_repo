package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@id='search']"
			)).click();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.youtube.com/watch?v=0_HaTpRsdLk");
	driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"
			)).click();
	driver.findElement(By.xpath("//a[@role='button']"
			)).click();
	
			
}
}
