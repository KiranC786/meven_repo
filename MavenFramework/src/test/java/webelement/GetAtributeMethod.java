package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtributeMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	System.out.println((driver.findElement(By.xpath("//a[@aria-label='Grocery']//img")).getAttribute("alt")));
	driver.manage().window().maximize();
	driver.close();
}
}
