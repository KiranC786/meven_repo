package webelement;

import java.io.File;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotByBase64 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		String base64 = ts.getScreenshotAs(OutputType.BASE64);
		byte[] convertedfile= Base64.getDecoder().decode(byte[ts]);
		 FileOutputStream fos = new FileOutputStream(new File("./screenshot/fbloginpage.png"));
		 fos.write(convertedfile);
		 fos.close();
	}

}
