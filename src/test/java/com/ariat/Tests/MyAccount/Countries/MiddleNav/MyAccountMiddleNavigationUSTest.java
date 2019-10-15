package com.ariat.Tests.MyAccount.Countries.MiddleNav;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ariat.Enums.EUCountries;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePagesCountries.HomePage;
import com.ariat.Pages.HomePagesCountries.HomePageUK;
import com.ariat.Pages.HomePagesCountries.HomePageUS;
import com.ariat.Pages.Main.MyAccountPage;
import com.ariat.Tests.Base.BaseTest;
import com.ariat.Utils.KillChrome;
import com.ariat.Pages.Header.SignInPage;

/**
 * Include tests for My account middle navigation
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MyAccountMiddleNavigationUSTest extends BaseTest {

	private Environments environment;
	private EUCountries euCountry;
	private HomePage homePage;
	private HomePageUK homePageUK;
	private HomePageUS homePageUS;
	private SignInPage signInPage;
	private MyAccountPage myAccountPage;

	public static final String EMAIL = "aila.bogasieru@ariat.com";
	public static final String PASSWORD = "Parola12345!";
	public static final String RELATIV_PATH = "/src/test/resources/chromedriver/chromedriver.exe";
	public static final String ABSOLUTE_PATH = System.getProperty("user.dir")+ RELATIV_PATH;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ABSOLUTE_PATH);
	}

	@Test(priority = 0)
	public void myAccountAccessPersonalInfoTestUS() {
		logger.info("Starting personal info US test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		signInPage = homePageUS.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPersonalInfoPageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnPersonalInfoPageChangePassMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing personal info US test...");
	}

	@Test(priority = 1)
	public void myAccountAccessEmailPrefTestUS() {
		logger.info("Starting email preferences US test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		signInPage = homePageUS.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnEmailPreferencePageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing email preferences US test...");
	}

	@Test(priority = 2)
	public void myAccountAccessAddressesTestUS() {
		logger.info("Starting addresses US test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		signInPage = homePageUS.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnAddressesPageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnAddAddressesPageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing addresses US test...");
	}

	@Test(priority = 3)
	public void myAccountAccessPaymentInfoTestUS() {
		logger.info("Starting payment info US test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		signInPage = homePageUS.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnPaymentInformationPageMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.returnAddACreditCardMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing payment info US test...");
	}

	@Test(priority = 4)
	public void myAccountAccessOrdersTestUS() {
		logger.info("Starting orders US test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		signInPage = homePageUS.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyOrdersPageViewAllMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing orders US test...");
	}

	@Test(priority = 5)
	public void myAccountAccessWishListTestUS() {
		logger.info("Starting wish list US test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePageUK = (HomePageUK) homePage.chooseEULocation(euCountry.UK, euCountry.UK.getCurrencyISO());
		homePageUS = (HomePageUS) homePage.chooseEULocation(euCountry.USA, euCountry.USA.getCurrencyISO());
		signInPage = homePageUS.returnSignInPage();
		signInPage.returningCustomer(EMAIL, "EnglishUS");
		signInPage.returningPassword(PASSWORD);
		myAccountPage = signInPage.returnMyAccountPage();
		myAccountPage.returnMyWishListPageViewAllMiddleNav();
		myAccountPage.myAccountClick();
		myAccountPage.logoutMiddle();
		logger.info("Finishing wish list US test...");
	}
	
	@AfterTest
	public void clearBrowserSession() {
		KillChrome kill = new KillChrome();
		kill.killChrome();
    }

	@AfterSuite
	public void tearDown() {
		homePage.quit();
		homePageUK.quit();
		homePageUS.quit();
		signInPage.quit();
		myAccountPage.quit();
	}
}
