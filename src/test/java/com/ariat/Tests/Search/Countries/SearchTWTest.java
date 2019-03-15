package com.ariat.Tests.Search.Countries;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Enums.GlobalCountries;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageTW;
import com.ariat.Tests.Base.BaseTest;

/**
 * Search product Taiwan test
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class SearchTWTest extends BaseTest {

	private HomePage homePage;
	private HomePageTW homePageTW;
	private GlobalCountries country;
	private Environments environment;
	private final String OPTION = "boots";
	private final String MESSAGE = "Product results for: ";

    public static final String filePath= "\\Users\\Aila\\eclipse-workspace\\ariat-regression\\src\\test\\resources\\chromedriver\\chromedriver.exe";
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", filePath);
	}

	@Test
	public void searchAddressTest() {
		logger.info("Starting search products Taiwan test");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageTW = (HomePageTW) homePage.chooseGlobalLocation(country.TW, country.TW.getCurrencyISO());
		homePageTW.search(OPTION);
	    homePageTW.assertProductDisplayed(MESSAGE+OPTION);
		homePageTW.seeAllproducts();
		logger.info("Finishing search products Taiwan test");
	}
	
	@AfterTest
	public void tearDown() {
		homePage.quit();
		homePageTW.quit();
	}
}