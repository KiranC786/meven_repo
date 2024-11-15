package webelement;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpliciteExpliciteWait {
	 static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		 FileInputStream file = new FileInputStream("./src/test/resource/trellologindetails.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://trello.com/home");
	    driver.findElement(By.xpath("//a[text()='Log in']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	    String loginPageTitle = driver.getTitle();
	    wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
	    if(loginPageTitle.equals("Log in to continue - Log in with Atlassian account")) {
	    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
	    
	    	driver.findElement(By.xpath("//span[text()='Continue']")).click();
	    
	    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
	    
	    	driver.findElement(By.xpath("//span[text()='Log in']")).click();
	    
	    }
	    	String homePageTitle = driver.getTitle();
	    	wait.until(ExpectedConditions.titleIs("Boards | Trello"));
	    	if (homePageTitle.equals("Boards | Trello")) {
				driver.findElement(By.xpath("//span[text()='Create new board']")).click();
				
				driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']")).sendKeys(workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue());
			wait.until(ExpectedConditions.elementToBeClickable((driver.findElement(By.xpath("//button[text()='Create']")))));
				if ((driver.findElement(By.xpath("//button[text()='Create']"))).isEnabled()) {
					
					driver.findElement(By.xpath("//button[text()='Create']")).click();
					
				}
	    	}
	    	String boardPageTitle = driver.getTitle();
	    	wait.until(ExpectedConditions.titleIs("M10 | Trello"));
			if (boardPageTitle.equals("M10 | Trello")) {
				for(int r=1;r<=5;r++) {
				
				driver.findElement(By.xpath("//textarea[@class='qJv26NWQGVKzI9']")).sendKeys(workbook.getSheet("Sheet1").getRow(r).getCell(3).getStringCellValue());
				
				driver.findElement(By.xpath("////textarea[@class='qJv26NWQGVKzI9']")).sendKeys(Keys.ENTER);
				
				}
					driver.findElement(By.xpath("//button[@aria-label='Show menu']")).click();
				
					driver.findElement(By.xpath("//div[text()='Close board']")).click();
				
					driver.findElement(By.xpath("//input[@data-testid='close-board-confirm-button']")).click();
					
					driver.findElement(By.xpath("//button[@data-testid='close-board-delete-board-button']")).click();
					
					driver.findElement(By.xpath("//button[@data-testid='close-board-delete-board-confirm-button']")).click();
				
			}		
			wait.until(ExpectedConditions.titleIs("Boards | Trello"));
	    if (homePageTitle.equals("Boards | Trello")) {
			driver.findElement(By.xpath("//span[@title='Kiran Karadka786 (kirankaradka786)']")).click();
			
			driver.findElement(By.xpath("//button[@data-testid='account-menu-logout']/..//span[text()='Log out']")).click();
			
		}
	    wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
	    if(loginPageTitle.equals("Log in to continue - Log in with Atlassian account")) {
	    	driver.findElement(By.xpath("//span[text()='Log out']")).click();
	    	
	    }
	    driver.manage().window().minimize();
	    driver.quit();
		}

}
