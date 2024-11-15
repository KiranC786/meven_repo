package webelement;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	 driver.findElement(By.id("name")).sendKeys("kiran");
	 driver.findElement(By.id("email")).sendKeys("kirankaradka768@gmail.com");
	 driver.findElement(By.id("password")).sendKeys("kira54");
	 driver.findElement(By.id("mobile")).sendKeys("8281602475");
	
	WebElement register = driver.findElement(By.xpath("//button[text()='Register now']"));
	if (register.isEnabled()) {
		System.out.println("register botton is anble ");
		
	}
	else {
		 driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
		driver.findElement(By.xpath("//i[@class='ico-tick resman-icon resman-icon-check-box-checked']")).click();
		System.out.println("now is enable  ");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
