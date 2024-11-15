package webelement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.TimeoutExceededException;

public class PageLoadTimeout {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	try {
		driver.get("https://www.flipkart.com/");
	} catch (TimeoutExceededException e) {
		System.out.println("This Application is not able to load the content within specific time");
		// TODO: handle exception
	}
}
}
