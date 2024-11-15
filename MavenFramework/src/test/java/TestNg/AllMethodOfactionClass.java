package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

@Test
public class AllMethodOfactionClass {
public static WebDriver driver;
public void precondition() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10 ));
}
@Test
public void  click() throws InterruptedException {

	driver.get("https://www.facebook.com/");
	WebElement loginbotton = driver.findElement(By.name("login"));
	Actions actions = new Actions(driver);
	actions.click(loginbotton);
	
}
@Test
public void contextClick() throws InterruptedException {
	driver.get("https://www.facebook.com/");
	Actions actions = new Actions(driver);
	WebElement loginbotton = driver.findElement(By.name("login"));
	actions.contextClick(loginbotton).perform();
}

 public void sendkeys() {
	 driver.get("https://www.facebook.com/");
		Actions actions = new Actions(driver);
		WebElement loginbotton = driver.findElement(By.id("email"));
		actions.sendKeys(driver.switchTo().activeElement(loginbotton));
	}

	
@AfterMethod
public void postconduition() {
	driver.manage().window().minimize();
	driver.quit();
}
	
}

