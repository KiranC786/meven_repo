package TestNg;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
 public static WebDriver driver;
@Test
public void hard() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10 ));
	driver.get("https://www.facebook.com/");
	assertEquals(driver.getTitle(), "Facebook – log in or sign up","facebook page log in page is incorrect");

}
@Test
	public void softassert() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10 ));
		driver.get("https://www.facebook.com/");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.getTitle(), "Facebook – log in or sign up","facebook page log in page is incorrect");
       System.out.println(driver.getCurrentUrl());
       driver.findElement(By.id("email")).sendKeys("abcd@gmil.com");
       
		softAssert.assertAll();
	}
	
}
