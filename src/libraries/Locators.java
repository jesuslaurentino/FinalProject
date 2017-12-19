package libraries;

public class Locators {
    //HomePage Locators
	public static final String SEARCH_BUTTON_XPATH = "//input[@value='Go']"; //'Go' SearchButton XPath
	public static final String SEARCH_FIELD_ID = "twotabsearchtextbox";  //'Search' Input TextBox ID
	/*-----------------------------------------------------------------------------------------------*/
    //ResultsPage Locators
	public static final String RESULTS_DIV_ID = "s-results-list-atf"; //'Results' Division ID
		//Case Material
		//Plastic material 
	public static final String PLAS_MAT_ELEM_XPATH = "//*[@id='leftNavContainer']"
			+ "//*[contains(@class,'a-size-small a-color-base s-ref-text-link s-ref-link-cursor')"
			+ " and contains(text(),'Plastic')]";              //'Plastic Material' Link XPath
	    //Wood material
	public static final String WOOD_MAT_ELEM_XPATH = "//*[@id='leftNavContainer']"
			+ "//*[contains(@class,'a-size-small a-color-base s-ref-text-link s-ref-link-cursor')"
			+ " and contains(text(),'Wood')]";              //'Wood Material' Link XPath
     	//Aluminum material
	public static final String ALUM_MAT_ELEM_XPATH = "//*[@id='leftNavContainer']"
			+ "//*[contains(@class,'a-size-small a-color-base s-ref-text-link s-ref-link-cursor')"
			+ " and contains(text(),'Aluminum')]";              //'Aluminum Material' Link XPath
	    //Rubber material
	public static final String RUBB_MAT_ELEM_XPATH = "//*[@id='leftNavContainer']"
			+ "//*[contains(@class,'a-size-small a-color-base s-ref-text-link s-ref-link-cursor')"
			+ " and contains(text(),'Rubber')]";              //'Rubber Material' Link XPath
	    //Synthetic Leather material 
	public static final String SYNTH_MAT_ELEM_XPATH = "//*[@id='leftNavContainer']"
			+ "//*[contains(@class,'a-size-small a-color-base s-ref-text-link s-ref-link-cursor')"
			+ " and contains(text(),'Synthetic Leather')]";  //'Synthetic Leather Material' Link XPath
	    //Suede material
	public static final String SUEDE_MAT_ELEM_XPATH = "//*[@id='leftNavContainer']"
			+ "//*[contains(@class,'a-size-small a-color-base s-ref-text-link s-ref-link-cursor')"
			+ " and contains(text(),'Suede')]";              //'Suede Material' Link XPath
	    //Genuine Leather
	public static final String GENIUNE_MAT_ELEM_XPATH = "//*[@id='leftNavContainer']"
			+ "//*[contains(@class,'a-size-small a-color-base s-ref-text-link s-ref-link-cursor')"
			+ " and contains(text(),'Genuine Leather')]";   //'Genuine Leather Material' Link XPath
	    //Price Filter
	public static final String MINIMUM_PRICE_ID = "low-price"; //'Low Price' Input TextBox ID
	public static final String MAXIMUM_PRICE_ID = "high-price";//'High Price' Input TextBox ID
	public static final String PRICE_BUTTON_XPATH = "//*[@id='a-autoid-61']/span/input";//'Go'(Price) SubmitButton XPath
	public static final String RESULT_COUNT = "//*[@id='s-result-count']"; //Result count title of a search
	public static final String NO_RESULT = "//*[@id='noResultsTitle']"; //No Result title of a search
	
	
	
	
}
