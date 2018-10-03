package basicTest;

import org.testng.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;






import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import pages.MainCaliber;

@Test
public class WikiLang {

	public static MainCaliber caliber;
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUpDriverAndPage() {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.get("https://dev-caliber.revature.tech/caliber/#/vp/home");
		caliber = new MainCaliber(driver);
		
	}
	
	@BeforeMethod
//	@Parameters({"wikipedia"})
	public void goToMainPage() {
		driver.get("https://dev-caliber.revature.tech/caliber/#/vp/home");
	}
	
	public void home() {
		caliber.getHome().click();
		AssertJUnit.assertEquals(driver.getTitle(), "Wikipedia – Die freie Enzyklopädie");
	}
	
	
	@AfterSuite
	public void cleanup() {
		driver.quit();
	}
	
	
	
	
}
