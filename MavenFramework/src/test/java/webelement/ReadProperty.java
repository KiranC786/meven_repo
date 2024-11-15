package webelement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperty {
static WebDriver driver;
public static void main(String[] args) throws IOException {
	FileInputStream file = new FileInputStream("./src/test/resource/fbcommondata.properties");
			Properties prob = new Properties();
			prob.load(file);
			String webbrowser = prob.getProperty("browser");
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
			driver.get(prob.getProperty("url"));
			driver.findElement(By.id("email")).sendKeys(prob.getProperty("email"));
			driver.findElement(By.id("pass")).sendKeys(prob.getProperty("password"));
			driver.manage().window().minimize();
			driver.quit();
}

}
