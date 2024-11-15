package webelement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugest {
	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		List<WebElement> a = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']/a//img"));
		List<WebElement> t = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']/a//spam/spam"));
		for(int i=0;i<=a.size()-1;i++) {
			WebElement screnss = a.get(i);
			String texte = t.get(i).getText();					
			File tempss = screnss.getScreenshotAs(OutputType.FILE);	
			File logo = new File("./screenshot/flipkart"+texte+timestamp+".png");
			FileUtils.copyFile(tempss, logo);
					
		}
		
	}
}
		
		
	

