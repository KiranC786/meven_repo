package webelement;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trello {
 static WebDriver driver;
 public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	 FileInputStream file = new FileInputStream("./src/test/resource/trellologindetails.xlsx");
	Workbook workbook = WorkbookFactory.create(file);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://trello.com/home");
    driver.findElement(By.xpath("//a[text()='Log in']")).click();
    Thread.sleep(2000);
    String loginPageTitle = driver.getTitle();
    if(loginPageTitle.equals("Log in to continue - Log in with Atlassian account")) {
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='Continue']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='Log in']")).click();
    	Thread.sleep(2000);
    }
    	String homePageTitle = driver.getTitle();
    	if (homePageTitle.equals("Boards | Trello")) {
			driver.findElement(By.xpath("//span[text()='Create new board']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']")).sendKeys(workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue());
			Thread.sleep(2000);
			if ((driver.findElement(By.xpath("//button[text()='Create']"))).isEnabled()) {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Create']")).click();
				Thread.sleep(2000);
			}
    	}
    	String boardPageTitle = driver.getTitle();
		if (boardPageTitle.equals("M10 | Trello")) {
			for(int r=1;r<=5;r++) {
				Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@class='qJv26NWQGVKzI9']")).sendKeys(workbook.getSheet("Sheet1").getRow(r).getCell(3).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.xpath("////textarea[@class='qJv26NWQGVKzI9']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			}
				driver.findElement(By.xpath("//button[@aria-label='Show menu']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[text()='Close board']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@data-testid='close-board-confirm-button']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@data-testid='close-board-delete-board-button']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@data-testid='close-board-delete-board-confirm-button']")).click();
				Thread.sleep(2000);
		}			
    if (homePageTitle.equals("Boards | Trello")) {
		driver.findElement(By.xpath("//span[@title='Kiran Karadka786 (kirankaradka786)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='account-menu-logout']/..//span[text()='Log out']")).click();
		Thread.sleep(2000);
	}
    if(loginPageTitle.equals("Log in to continue - Log in with Atlassian account")) {
    	driver.findElement(By.xpath("//span[text()='Log out']")).click();
    	Thread.sleep(2000);
    }
    driver.manage().window().minimize();
    driver.quit();
	}

}


