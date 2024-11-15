package webelement;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.function.CheckedRunnable;

public class fuctiionalityOfStateDropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://pmkisan.gov.in/RegistrationFormNew.aspx");
	Thread.sleep(2000);
	WebElement sateDropdown = driver.findElement(By.id("ContentPlaceHolder1_DropDownState"));
	Select stateSelect = new Select(sateDropdown);
	List<WebElement> allopts = stateSelect.getOptions();
	for(WebElement opt : allopts);
	
      
	
	
}
}
