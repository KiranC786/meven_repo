package webelement;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Tolearne {
	@Test
public void report() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orientalschool.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		String photo = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark =new ExtentSparkReporter("./HTML_Report/screenshotdarkReport.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("endhalum oru pere pore");
		
		ExtentReports exreport=new ExtentReports() ;
		exreport.attachReporter(spark);
		ExtentTest test=exreport.createTest("screenshot");
		test.log(Status.PASS, "oprn browser");
		test.addScreenCaptureFromBase64String(photo);
	
		
		exreport.flush();
	
		
	
}
}
