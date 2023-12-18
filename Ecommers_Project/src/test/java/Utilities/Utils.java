package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constents.Constent;



public class Utils extends Constent{
	
private static final Logger log = (Logger) LogManager.getLogger(Utils.class);

	
	public void LounchBrowser() {
		
		switch (Constent.Browser_Name.toLowerCase()) {
		case "chrome":
			try {
				
				log.info("Louching The Chrome Browser" );
				System.setProperty(Constent.system,Constent.Browser_Path);
				
				ChromeOptions option = new ChromeOptions();
				
				option.addArguments("--disable-notifications");
				
				driver = new ChromeDriver(option);
				
				wait = new WebDriverWait(driver, 30);
			    driver.manage().window().maximize();
			    
			    log.info("User Given Wait StateMent ");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
			} catch (Exception e) {
				
				log.error(e.getMessage());
			}
			
			
			break;

		case  "firefox":
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
			driver = new FirefoxDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;
		}
	}
	
	
	
	public static void ReadProperties() throws IOException {
		
		
		     log.info("Read The Properties File ");
			FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Ecommers_Project\\src\\test\\resources\\Properties_File\\Data.properties");
			
			Properties pro = new Properties();
			
			pro.load(file);
			
			log.info("Get The Data Form Properties File ");
			Constent.Url=  pro.getProperty("url");
			Constent.Browser_Name = pro.getProperty("browser");
			Constent.Browser_Path=   pro.getProperty("browserPath");
			
			 Constent.Product_Name = pro.getProperty("product_Name");
			 
			 Constent.New_Arrival=pro.getProperty("New_Arrival_Product");
		
			
			
	}
	
	public static void ScrollDwonPage(WebElement scroll) {
		
		JavascriptExecutor ex =  (JavascriptExecutor)driver;
		
		ex.executeScript("arguments[0].scrollIntoView(true)",scroll);
	}

		
	/*public void GetProperties() throws IOException {
		
		log.info("Get The Data Form Properties File ");
		constent.Url=  ReadProperties().getProperty("url");
		constent.Browser_Name = ReadProperties().getProperty("browser");
		constent.Browser_Path=   ReadProperties().getProperty("browserPath");
		constent.Accountlogo=  ReadProperties().getProperty("AccountLogo");
	}*/

}
