package webelement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeOutImplicitly {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://services.ecourts.gov.in/ecourtindia_v6/?p=casestatus/index&app_token=f7cf112a0aa19b160d93ea8df58ae038cd6dcff2106817cf2b979a742af48668");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//label[text()='Disposed']/..//input[@id='radD']")).clear();
}
}
