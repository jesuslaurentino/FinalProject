package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import libraries.Locators;

public class HomePage {
	private WebDriver driver;
	
	@FindBy(how=How.ID,using=Locators.SEARCH_FIELD_ID)
	WebElement searchTxt;
	
	@FindBy(how=How.XPATH,using=Locators.SEARCH_BUTTON_XPATH)
	WebElement searchBtn;
	
	public HomePage(WebDriver driver2) {
		driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public ResultsPage searchProduct(String prod) {
		searchTxt.sendKeys(prod);
		searchBtn.click();
		return new ResultsPage(driver);
		
	}
}
