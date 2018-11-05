package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.Categories.WomenCategories.WomenCategoryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesBagsPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesHeadwearPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesScarfAndPonchosPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesSocksPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingSubcategories.WomenClothingBreechesAndTightsPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingSubcategories.WomenClothingOuterwearPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingSubcategories.WomenClothingShowPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingSubcategories.WomenClothingSweatTshirtAndWoodiesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenClothingSubcategories.WomenClothingTopsAndTshirtsPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedSubcategories.WomenFeaturedHeritageCollectionPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedSubcategories.WomenFeaturedTriFactorBreechPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedSubcategories.WomenFeaturedWarmWeatherRidingPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearSubcategories.WomenFootwearCasualShoesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearSubcategories.WomenFootwearCountryPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearSubcategories.WomenFootwearRidingPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFootwearSubcategories.WomenFootwearWesternPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test pages redirection from Women Category to all its sub-categories tree
 * structure
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenCategoriesAndSubcategoriesTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private WomenCategoryPage womenCategoryPage;
	private WomenFootwearPage womenFootwearPage;
	private WomenFootwearWesternPage womenFootwearWesterenPage;
	private WomenClothingPage womenClothingPage;
	private WomenAccessoriesPage womenAccessoriesPage;
	private WomenFeaturedPage womenFeaturedPage;
	private WomenFootwearRidingPage womenFootwearRidingPage;
	private WomenFootwearWesternPage womenFootwearWesternPage;
	private WomenFootwearCountryPage womenFootwearCountryPage;
	private WomenFootwearCasualShoesPage womenFootwearCasualShoesPage;
	private WomenClothingOuterwearPage womenClothingOuterwearPage;
	private WomenClothingBreechesAndTightsPage womenClothingBreechesAndTightsPage;
	private WomenClothingShowPage womenClothingShowPage;
	private WomenClothingSweatTshirtAndWoodiesPage womenClothingSweatTshirtAndWoodiesPage;
	private WomenClothingTopsAndTshirtsPage womenClothingTopsAndTshirtsPage;
	private WomenAccessoriesBagsPage womenAccessoriesBagsPage;
	private WomenAccessoriesGlovesPage womenAccessoriesGlovesPage;
	private WomenAccessoriesHeadwearPage womenAccessoriesHeadwearPage;
	private WomenAccessoriesScarfAndPonchosPage womenAccessoriesScarfAndPonchosPage;
	private WomenAccessoriesSocksPage womenAccessoriesSocksPage;
	private WomenFeaturedHeritageCollectionPage womenFeaturedHeritageCollectionPage;
	private WomenFeaturedWarmWeatherRidingPage womenFeaturedWarmWeatherRidingPage;
	private WomenFeaturedTriFactorBreechPage womenFeaturedTriFactorBreechPage;

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void navigateWomenFootwearCategories() {
		logger.info("Starting navigate Women Footwear sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		womenCategoryPage.womenCategory();
		womenCategoryPage.returnWomenFootwearPage();
		womenCategoryPage.womenCategory();
		womenFootwearRidingPage = womenFootwearPage.returnWomenFootwearRidingCategoryPage();
		womenCategoryPage.womenCategory();
		womenFootwearWesternPage = womenFootwearPage.returnWomenFootwearWesternCategoryPage();
		womenCategoryPage.womenCategory();
		womenFootwearCountryPage = womenFootwearPage.returnWomenFootwearCountryCategoryPage();
		womenCategoryPage.womenCategory();
		womenFootwearCasualShoesPage = womenFootwearPage.returnWomenFootwearCasualShoesCategoryPage();
		logger.info("Finishing navigate Women Footwear sub-categories test.");
	}

	@Test(priority = 1)
	public void navigateWomenClothingCategoriesTest() {
		logger.info("Starting navigate Women Clothing sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		womenCategoryPage.womenCategory();
		womenClothingPage = womenCategoryPage.returnWomenClothingCategoryPage();
		womenCategoryPage.womenCategory();
		womenClothingOuterwearPage = womenClothingPage.returnWomenClothingOuterwearCategoryPage();
		womenCategoryPage.womenCategory();
		womenClothingBreechesAndTightsPage = womenClothingPage.returnWomenClothingBreechesAndTightsCategoryPage();
		womenCategoryPage.womenCategory();
		womenClothingShowPage = womenClothingPage.returnWomenClothingShowCategoryPage();
		womenCategoryPage.womenCategory();
		womenClothingSweatTshirtAndWoodiesPage = womenClothingPage.returnWomenClothingSweatTshirtAndWoodiesCategoryPage();
		womenCategoryPage.womenCategory();
		womenClothingTopsAndTshirtsPage = womenClothingPage.returnWomenClothingTopsAndTshirtsCategoryPage();
		logger.info("Finishing navigate Women Clothing sub-categories test.");
	}

	@Test(priority = 2)
	public void navigateWomenAccessoriesCategoriesTest() {
		logger.info("Starting navigate Women Accessories sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		womenCategoryPage.womenCategory();
		womenAccessoriesPage = womenCategoryPage.returnWomenAccessoriesCategoryPage();
		womenCategoryPage.womenCategory();
		womenAccessoriesBagsPage = womenAccessoriesPage.returnWomenAccessoriesBagsCategoryPage();
		womenCategoryPage.womenCategory();
		womenAccessoriesGlovesPage = womenAccessoriesPage.returnWomenAccessoriesGlovesCategoryPage();
		womenCategoryPage.womenCategory();
		womenAccessoriesHeadwearPage = womenAccessoriesPage.returnWomenAccessoriesHeadwearCategoryPage();
		womenCategoryPage.womenCategory();
		womenAccessoriesScarfAndPonchosPage = womenAccessoriesPage.returnWomenAccessoriesScarfAndPonchosCategoryPage();
		womenCategoryPage.womenCategory();
		womenAccessoriesSocksPage = womenAccessoriesPage.returnWomenAccessoriesSocksCategoryPage();
		logger.info("Finishing navigate Women Accessories sub-categories test.");
	}

	@Test(priority = 3)
	public void navigateWomenFeaturedCategoriesTest() {
		logger.info("Starting navigate Women Featured sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		womenCategoryPage = homePage.returnWomenCategoryPage();
		womenCategoryPage.womenCategory();
		womenFeaturedPage = womenCategoryPage.returnWomenFeaturedCategoryPage();
		womenCategoryPage.womenCategory();
		womenFeaturedHeritageCollectionPage = womenFeaturedPage.returnWomenFeaturedHeritageCollectionCategoryPage();
		womenCategoryPage.womenCategory();
		womenFeaturedWarmWeatherRidingPage = womenFeaturedPage.returnWomenFeaturedWarmWeatherRidingCategoryPage();
		womenCategoryPage.womenCategory();
		womenFeaturedTriFactorBreechPage = womenFeaturedPage.returWomenFeaturedTriFactorBreechCategoryPage();
		logger.info("Finishing navigate Women Featured sub-categories test.");
	} 

	@AfterTest
	public void tearDown() {
		homePage.quit();
		womenCategoryPage.quit();
		womenFootwearPage.quit();
		womenFootwearWesterenPage.quit();
		womenClothingPage.quit();
		womenFootwearRidingPage.quit();
		womenFootwearWesternPage.quit();
		womenFootwearCountryPage.quit();
		womenFootwearCasualShoesPage.quit();
		womenClothingOuterwearPage.quit();
		womenClothingBreechesAndTightsPage.quit();
		womenClothingShowPage.quit();
		womenClothingSweatTshirtAndWoodiesPage.quit();
		womenClothingTopsAndTshirtsPage.quit();
		womenAccessoriesPage.quit();
		womenAccessoriesBagsPage.quit();
		womenAccessoriesGlovesPage.quit();
		womenAccessoriesHeadwearPage.quit();
		womenAccessoriesScarfAndPonchosPage.quit();
		womenAccessoriesSocksPage.quit();
		womenFeaturedHeritageCollectionPage.quit();
		womenFeaturedWarmWeatherRidingPage.quit();
		womenFeaturedTriFactorBreechPage.quit();
		womenFeaturedPage.quit();
	}
}
