package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ClickandHold {
	
	public static WebDriver driver;
	@Test
	public void precondition() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10 ));
	}
	@Test
public void dragAndDrop() {
	driver.get(null);
	driver.switchTo().frame(0);
	WebElement deagg = driver.findElement(By.id(""));
	WebElement drop = driver.findElement(By.id(""));
	Actions actions = new Actions(driver);
	actions.clickAndHold(deagg).release(drop).perform();
	
}
	@Test
	public void keyupAndkeydown() {
		driver.get("");
		WebElement userNameTextfield = driver.findElement(By.id(""));
		Actions action = new Actions(driver);
		action.keyDown(userNameTextfield, "a").keyUp(userNameTextfield,Keys.CONTROL).sendKeys(userNameTextfield,Keys.DELETE).
		keyDown(userNameTextfield,Keys.SHIFT ).sendKeys(userNameTextfield,"a").keyUp(userNameTextfield,Keys.SHIFT).sendKeys(userNameTextfield
		,"dmin").build().perform();
		
		
	}
	@Test
	public void nscrollToEle() {
		driver.get(null);
		WebElement searchEle = driver.findElement(By.xpath(null));
		Actions action = new Actions(driver);
		
		action.scrollToElement(searchEle).click(searchEle).perform();
		//action.scrollByAmount(0, 1000).perform();
	}
	@AfterMethod
	public void postconduition() {
		driver.manage().window().minimize();
		driver.quit();
	}
	
	
}

