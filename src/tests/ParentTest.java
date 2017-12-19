package tests;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import libraries.Properties;
import pages.HomePage;
import pages.ResultsPage;

public class ParentTest {
	protected WebDriver driver;
	protected HomePage homePage;
	protected ResultsPage resultsPage;
	
	protected void setUp(String browser, String url) {
		switch(browser) {
        case Properties.CHROME_BROWSER:
            System.setProperty(Properties.CHROME_DRIVER_PROPERTY, Properties.CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
            break;
        case Properties.FIREFOX_BROWSER:    
            System.setProperty(Properties.FIREFOX_DRIVER_PROPERTY, Properties.FIREFOX_DRIVER_PATH);
            driver = new FirefoxDriver();
            break;
        case Properties.IE_BROWSER:    
            System.setProperty(Properties.IE_DRIVER_PROPERTY, Properties.IE_DRIVER_PATH);
            driver = new InternetExplorerDriver();
            break;
        default:
            System.setProperty(Properties.FIREFOX_DRIVER_PROPERTY, Properties.FIREFOX_DRIVER_PATH);
            driver = new FirefoxDriver();
            break;
        }
        driver.get(url);
        homePage = new HomePage(driver);
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
