package StepDefenition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Constents.Constent;
import Utilities.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Commons extends Constent {
	
private static final Logger log = (Logger) LogManager.getLogger(Commons.class);
	
	@Before
	public void lounch_Browser() throws IOException {
		
		log.info("Create An Object For Utility Class ");
		
		Utils util = new Utils();
		
		log.info("Call The Readproprties Method To Execusion");
		
		util.ReadProperties();
		
		log.info("Calling LounchBrowser Method To Loanching the Browser");
		
		util.LounchBrowser();
		
	}
	
	@AfterStep
	public void TearDown(Scenario sc) throws IOException {
		
		if(sc.isFailed()==true) {
			
	    log.info("In This Test Scenario As Ben Failed"+sc.getName());
			
		TakesScreenshot take = (TakesScreenshot) driver;
		
		byte[] sourse = take.getScreenshotAs(OutputType.BYTES);
		
		sc.attach(sourse, "image/png", sc.getName());
		
		}
		
		
		
	}
	
	@After
	public void TearDown() {
		
        log.info("Close The Browser ");
		
    	driver.quit();
	}
	
	

	

}



