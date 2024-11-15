package webelement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertysOf {
static WebDriver driver;
public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream file = new FileInputStream("./src/test/resource/fbsignupcommondata.properties");
	 Properties pobj = new Properties();
	 pobj.load(file);
	 String webbrowser = pobj.getProperty("browser");
		if (webbrowser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if (webbrowser.equals("firefox")) {
			driver=new FirefoxDriver();
			
			
		}
		else if (webbrowser.equals("edge")) {
			driver=new EdgeDriver();
			
		}
	 driver.manage().window().maximize();
	 driver.get(pobj.getProperty("url"));
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(pobj.getProperty("firstname"));
	 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(pobj.getProperty("lastname"));
	 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(pobj.getProperty("mobile"));
	 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(pobj.getProperty("password"));
	 driver.findElement(By.xpath("//label[text()='Male']")).click();
	 driver.findElement(By.xpath("//input[@name='websubmit']")).click();
	 
}

}
