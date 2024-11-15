package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement element=driver.findElement(By.xpath("//input[@id='pass']"));
	System.out.println(element.getSize().getHeight());
	System.out.println(element.getSize().getWidth());
	WebElement elements=driver.findElement(By.xpath("//input[@id='email']"));
	System.out.println(elements.getSize().getHeight());
	System.out.println(elements.getSize().getWidth());
	if (element.equals(elements) ) 
	{System.out.println( "is same size ");
	
	}
	else
		System.out.println("its nte the same size");
}
}
