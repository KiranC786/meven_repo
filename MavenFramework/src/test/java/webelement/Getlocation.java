package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://services.ecourts.gov.in/ecourtindia_v6/?p=casestatus/index&app_token=f7cf112a0aa19b160d93ea8df58ae038cd6dcff2106817cf2b979a742af48668");
		String xpath[]= {"//label[text()='Disposed']/..//input[@id='radD']","//label[text()='Pending']/..//input[@id='radP']","//label[text()='Both']/..//input[@id='radB']"};
		for( String path:  xpath) {
			 WebElement enable  = driver.findElement(By.xpath(path));
			
		if (enable .isSelected()) {
			System.out.println("is selsected");
			
		}
		else {
			System.out.println("is not sescted");
		}	
			
		}
		}
	}


