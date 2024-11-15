package webelement;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshote {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	byte[] bytes= ts.getScreenshotAs(OutputType.BYTES);
	FileOutputStream fos=new FileOutputStream(new File("./screenshot/fbloginpage.png"));
	fos.write(bytes);
	fos.close();
	
	
}
}

