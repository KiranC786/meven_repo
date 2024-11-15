package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsegeOfClickMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=Cj0KCQjw28W2BhC7ARIsAPerrcJDKBUoJFoJE3U4iIv-AGr91yRarddGK8sX5WeFTKoDD2FcqvUMsZIaAjJ6EALw_wcB");
	driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[test()='Round-trip']")).click();
	driver.findElement(By.xpath("//div[@class='sc-12foipm-91 biWUTl']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='sc-12foipm-72 ezNmSh']")).click();
	
}
}
