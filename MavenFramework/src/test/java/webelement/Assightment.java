package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assightment {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://onlineksrtcswift.com/");
	driver.findElement(By.xpath("//a[text()='x']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='submitSearch']")).click();
	WebElement textf = driver.findElement(By.xpath("//div[text()='MODIFY']"));
	Thread.sleep(2000);
	textf.click();
	String textfieldBc = textf.getCssValue("background");
	System.out.println("textfield border color is "+
	org.openqa.selenium.support.Color.fromString(textfieldBc).asHex());
}
}
