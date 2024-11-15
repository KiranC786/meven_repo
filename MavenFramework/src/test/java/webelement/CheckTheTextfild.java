package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheTextfild {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/results?search_query=nivarunna+vayiyora+");
	WebElement elm= driver.findElement(By.className("yt-spec-touch-feedback-shape__fill"));
	System.out.println("the attribute is "+ elm.getAttribute("placeholder"));
	driver.close();
	
	
			
}
}
