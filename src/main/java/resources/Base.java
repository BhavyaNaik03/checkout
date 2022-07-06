package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	
	public Properties prop;

	public WebDriver initializeBrowser() throws IOException {
		
		WebDriver driver = null;
		
		prop= new Properties();
		
		File file= new File(".\\src\\main\\java\\resources\\data.properties");
		
		FileInputStream fis = new FileInputStream(file);
		
		prop.load(fis);
		String browserName= prop.getProperty("browser");

		
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	return driver;

	}

	public String takeScreenShot(String testName, WebDriver driver) throws IOException {
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotFile, new File(System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png"));
		return System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
	}
}
