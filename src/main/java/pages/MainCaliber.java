package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainCaliber {

	public static WebDriver driver;
	
	public MainCaliber(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUsername() {
		return driver.findElement(By.name("username"));
	}
	
	public WebElement getPassword() {
		return driver.findElement(By.name("pw"));
	}
	
	public WebElement getSubmit() {
		return driver.findElement(By.cssSelector("input[value='Login']"));
	}
	
	
	public WebElement getHome() {
		return driver.findElement(By.cssSelector("a[ui-sref='vp.home']"));
	}
	
	public WebElement getManageBatch() {
		return driver.findElement(By.cssSelector("a[ui-sref='vp.manage']"));
	}
	
	public WebElement getAssessBatch() {
		return driver.findElement(By.cssSelector("a[ui-sref='vp.assess']"));
	}
	
	public WebElement getQualityAudit() {
		return driver.findElement(By.cssSelector("a[ui-sref='vp.audit']"));
	}
	
	public WebElement getPanel() {
		return driver.findElement(By.cssSelector("a[ui-sref='vp.panel']"));
	}
	
	public WebElement getReports() {
		return driver.findElement(By.cssSelector("a[ui-sref='vp.reports']"));
	}
	
	public WebElement getSettings() {
		return driver.findElement(By.cssSelector("a[class='dropdown-toggle']"));
	}
}
