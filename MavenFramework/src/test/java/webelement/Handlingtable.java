package webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtable {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://money.rediff.com/gainers");
	List<WebElement> ttrows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	List<WebElement> onerows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[599]/td[4]"));
	List<WebElement> ttcoum = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
	System.out.println(ttcoum.size());
	System.out.println(ttrows.size());
	for (WebElement cc : ttcoum) {
		System.out.print(cc.getText());
		
	}
	System.out.println();
	for (WebElement rr : ttrows) {
		System.out.println(rr.getText());
	}
	for (WebElement or : onerows) {
		
	
	System.out.println(or.getText());
	}
}
}
