package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import libraries.Locators;

public class ResultsPage {
	private WebDriver driver;
	
	
	@FindBy(how=How.ID,using=Locators.RESULTS_DIV_ID)
	WebElement resultsDiv;
	
	@FindBy(how=How.XPATH,using=Locators.PLAS_MAT_ELEM_XPATH)
	WebElement plasticMatFilterElem;
	
	@FindBy(how=How.XPATH,using=Locators.WOOD_MAT_ELEM_XPATH)
	WebElement woodMatFilterElem;
	
	@FindBy(how=How.XPATH,using=Locators.ALUM_MAT_ELEM_XPATH)
	WebElement aluminiumMatFilterElem;
	
	@FindBy(how=How.XPATH,using=Locators.RUBB_MAT_ELEM_XPATH)
	WebElement rubberMatFilterElem;
	
	@FindBy(how=How.XPATH,using=Locators.SYNTH_MAT_ELEM_XPATH)
	WebElement syntheticMatFilterElem;
	
	@FindBy(how=How.XPATH,using=Locators.SUEDE_MAT_ELEM_XPATH)
	WebElement suedeMatFilterElem;
	
	@FindBy(how=How.XPATH,using=Locators.GENIUNE_MAT_ELEM_XPATH)
	WebElement geniuneMatFilterElem;
	
	@FindBy(how=How.ID,using=Locators.MINIMUM_PRICE_ID)
	WebElement minPriceTxt;
	
	@FindBy(how=How.ID,using=Locators.MAXIMUM_PRICE_ID)
	WebElement maxPriceTxt;
	
	@FindBy(how=How.XPATH,using=Locators.PRICE_BUTTON_XPATH)
	WebElement goButton;
	
	@FindBy(how=How.XPATH,using=Locators.RESULT_COUNT)
	WebElement resultCount;
	
	@FindBy(how=How.XPATH,using=Locators.NO_RESULT)
	WebElement noResult;
	
	public ResultsPage(WebDriver driver2) {
		driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public void verifyPrices() {
		
	}
	public void filterByPrice(double min, double max) {
		//Input maximun and minimun prices for filtering results by price
			minPriceTxt.sendKeys(Double.toString(min));
			maxPriceTxt.sendKeys(Double.toString(max));
			goButton.click();
	
	}
	public void verifyMaterial(String Material) {
		//Verify filter returns at least one item and title displays the material filtered
		//add a wait
		if(resultCount.getText().contains(Material)) {
			System.out.println("filterByMaterial - verifyMaterial: Filter did returned some result(s) with "+Material+" !");
		}
		else {
			System.out.println("filterByMaterial - verifyMaterial: Filter did NOT returned any result(s) with "+Material+" !");
		}
	}
	public void verifyResultsPresent() {
		//verify if noResult  or  resultCount displayed
		//add a wait, but how?
		if(noResult.isDisplayed()) {
			throw new NoSuchElementException("verifyResultsPresent: Search did NOT returned any result!");
			//System.out.println("verifyResultsPresent: Search did NOT returned any result!");
			//preguntar como salirse de una ejecucion 
		}else if (resultCount.isDisplayed()) {
			throw new NoSuchElementException("verifyResultsPresent: Search did returned some result(s)!");
			//System.out.println("verifyResultsPresent: Search did returned some result(s)!");
		}
		
	}
	public void filterByMaterial(String Material) {
		
			switch(Material) {
			case "Plastic":  
				clickAndWait(plasticMatFilterElem);
				break;
			case "Wood": 	 
				clickAndWait(woodMatFilterElem);
				break;
			case "Aluminum": 
				clickAndWait(aluminiumMatFilterElem);
				break;
			case "Rubber":	 
				clickAndWait(rubberMatFilterElem);
				break;
			case "Synthetic Leather": 
				clickAndWait(syntheticMatFilterElem);
				break;
			case "Suede":
				clickAndWait(suedeMatFilterElem);
				break; 
			case "Genuine Leather":
				clickAndWait(geniuneMatFilterElem);
				break;
			default: throw new NoSuchElementException("filterByMaterial: No such element material at user input!");
			}
			
			verifyMaterial(Material);
		
	}
	
	public void clickAndWait(WebElement element) {
		try {
		new WebDriverWait (driver,10).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		}catch(NoSuchElementException e) {
			System.out.println("filterByMaterial - clickAndWait: Element not available to be clicked. Option not available!");
		}
	}

}
