package webelement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScreenshot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	for(int i=1;i>1;i++)
	{
		if (i==1) {
		File temp = driver.findElement(By.xpath("//img[@alt='Grocery']")).getScreenshotAs(OutputType.FILE);
		File file = new File("./screenshot/fkloginpage1.png");
	     FileUtils.copyFile(temp, file);
	     i++;
		}
		else if (i==2) {
			File temp = driver.findElement(By.xpath("//img[@alt='Mobiles']")).getScreenshotAs(OutputType.FILE);
			File file = new File("./screenshot/fkloginpage2.png");
		     FileUtils.copyFile(temp, file);
		     i++;
			}
		else if (i==3) {
			File temp = driver.findElement(By.xpath("//img[@alt='Fashion']")).getScreenshotAs(OutputType.FILE);
			File file = new File("./screenshot/fkloginpage3.png");
		     FileUtils.copyFile(temp, file);
		     i++;
			}
		else if (i==4) {
			File temp = driver.findElement(By.xpath("//img[@alt='Electronics']")).getScreenshotAs(OutputType.FILE);
			File file = new File("./screenshot/fkloginpage4.png");
		     FileUtils.copyFile(temp, file);
		     i++;
			}
		else if (i==5) {
			File temp = driver.findElement(By.xpath("//img[@alt='Home & Furniture']")).getScreenshotAs(OutputType.FILE);
			File file = new File("./screenshot/fkloginpage5.png");
		     FileUtils.copyFile(temp, file);
		     i++;
			}
		else if (i==6) {
			File temp = driver.findElement(By.xpath("//img[@alt='Appliances']")).getScreenshotAs(OutputType.FILE);
			File file = new File("./screenshot/fkloginpage6.png");
		     FileUtils.copyFile(temp, file);
		     i++;
			}
		else if (i==7) {
			File temp = driver.findElement(By.xpath("//img[@alt='Flight Bookings']")).getScreenshotAs(OutputType.FILE);
			File file = new File("./screenshot/fkloginpage7.png");
		     FileUtils.copyFile(temp, file);
		     i++;
			}
		else if (i==8) {
			File temp = driver.findElement(By.xpath("//img[@alt='Beauty, Toys & More']")).getScreenshotAs(OutputType.FILE);
			File file = new File("./screenshot/fkloginpage8.png");
		     FileUtils.copyFile(temp, file);
			}
		else if (i==9) {
			File temp = driver.findElement(By.xpath("//img[@alt='Two Wheelers']")).getScreenshotAs(OutputType.FILE);
			File file = new File("./screenshot/fkloginpage9.png");
		     FileUtils.copyFile(temp, file);
		     i++;
			}
	}
	driver.manage().window().minimize();
	driver.quit();
	
}
}
