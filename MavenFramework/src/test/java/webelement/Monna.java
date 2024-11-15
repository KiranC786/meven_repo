package webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Monna {
public static WebDriver driver;
@Test
public void parameter() {
	 String url = System.getProperty("url");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	Reporter.log("this website is lunched ",true);
}	

}
