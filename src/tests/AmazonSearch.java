package tests;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import pages.HomePage;
import pages.ResultsPage;


@RunWith(JUnitParamsRunner.class)
public class AmazonSearch extends ParentTest{
	@Test
	@FileParameters("./data/testParameters.csv")
	public void testSearchProduct(String url, String browser, 
			String prod, String material, double price_min, 
			double price_max) {
        //first navigate to amazon
		setUp(browser,url);
        //next search product
		resultsPage = homePage.searchProduct(prod);
        //then verify that you have at least one result
		resultsPage.verifyResultsPresent();
        //next filter by material
		resultsPage.filterByMaterial(material);
        //then filter by price
		resultsPage.filterByPrice(price_min,price_max);
        //finally verify that all the products cost the price you entered.
		//resultsPage.verifyPrices();
    }

	
}
