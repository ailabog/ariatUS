package com.ariat.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ariat.Enums.Environments;
import com.ariat.Pages.HomePage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenAccessoriesPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenCategoryPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenClothingPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFeaturedPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenAccessoriesSubcategories.MenAccessoriesBagsPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenAccessoriesSubcategories.MenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenAccessoriesSubcategories.MenAccessoriesHeadwearPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenAccessoriesSubcategories.MenAccessoriesSocksPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenClothingSubcategories.MenClothingBreechesPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenClothingSubcategories.MenClothingOuterwearPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenClothingSubcategories.MenClothingSweatTshirtAndWoodiesPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenClothingSubcategories.MenClothingTopsAndTshirtsPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFeaturedSubcategories.MenFeaturedTeamCollectionPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFeaturedSubcategories.MenFeaturedVentTekPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFootwearSubcategories.MenFootwearCasualShoesPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFootwearSubcategories.MenFootwearCountryPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFootwearSubcategories.MenFootwearPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFootwearSubcategories.MenFootwearRidingPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFootwearSubcategories.MenFootwearWesternPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFootwearSubcategories.MenFootwearWorkPage;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Test pages redirection from Men Category to all its sub-categories tree
 * structure
 * 
 * @author aila.bogasieru@ariat.com
 *
 */

public class MenCategoriesAndSubcategoriesTest extends BaseTest {

	private Environments environment;
	private HomePage homePage;
	private MenCategoryPage menCategoryPage;
	private MenFootwearPage menFootwearPage;
	private MenFootwearWesternPage menFootwearWesterenPage;
	private MenClothingPage menClothingPage;
	private MenAccessoriesPage menAccessoriesPage;
	private MenFeaturedPage menFeaturedPage;
	private MenFootwearRidingPage menFootwearRidingPage;
	private MenFootwearWorkPage menFootwearWorkPage;
	private MenFootwearCountryPage menFootwearCountryPage;
	private MenFootwearCasualShoesPage menFootwearCasualShoesPage;
	private MenClothingOuterwearPage menClothingOuterwearPage;
	private MenClothingBreechesPage menClothingBreechesPage;
    private MenClothingSweatTshirtAndWoodiesPage menClothingSweatTshirtAndWoodiesPage;
	private MenClothingTopsAndTshirtsPage menClothingTopsAndTshirtsPage;
	private MenAccessoriesBagsPage menAccessoriesBagsPage;
	private MenAccessoriesGlovesPage menAccessoriesGlovesPage;
	private MenAccessoriesHeadwearPage menAccessoriesHeadwearPage;

	private MenAccessoriesSocksPage menAccessoriesSocksPage;
	private MenFeaturedTeamCollectionPage menFeaturedTeamCollectionPage;
	private MenFeaturedVentTekPage menFeaturedVentTekPage;
	

	@BeforeTest
	public void setUp() {
		ChromeDriverManager.getInstance().setup();
	}

	@Test(priority = 0)
	public void navigateMenFootwearCategories() {
		logger.info("Starting navigate Men Footwear sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		menCategoryPage = homePage.returnMenCategoryPage();
		menCategoryPage.menCategory();
		menFootwearPage = menCategoryPage.returnMenFootwearPage();
		menCategoryPage.menCategory();
		menFootwearRidingPage = menFootwearPage.returnMenFootwearRidingCategoryPage();
		menCategoryPage.menCategory();
		menFootwearWesterenPage = menFootwearPage.returnMenFootwearWesternCategoryPage();
		menCategoryPage.menCategory();
		menFootwearCountryPage = menFootwearPage.returnMenFootwearCountryCategoryPage();
		menCategoryPage.menCategory();
		menFootwearCasualShoesPage = menFootwearPage.returnMenFootwearCasualShoesCategoryPage();
		menCategoryPage.menCategory();
		menFootwearWorkPage = menFootwearPage.returnMenFootwearWorkCategoryPage();
		logger.info("Finishing navigate Men Footwear sub-categories test.");
	}

	@Test(priority = 1)
	public void navigateMenClothingCategoriesTest() {
		logger.info("Starting navigate Men Clothing sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		menCategoryPage = homePage.returnMenCategoryPage();
		menCategoryPage.menCategory();
		menClothingPage = menCategoryPage.returnMenClothingCategoryPage();
		menCategoryPage.menCategory();
		menClothingOuterwearPage = menClothingPage.returnMenClothingOuterwearCategoryPage();
		menCategoryPage.menCategory();
		menClothingBreechesPage = menClothingPage.returnMenClothingBreechesCategoryPage();
		menCategoryPage.menCategory();
		menClothingSweatTshirtAndWoodiesPage = menClothingPage.returnMenClothingSweatTshirtAndWoodiesCategoryPage();
		menCategoryPage.menCategory();
		menClothingTopsAndTshirtsPage = menClothingPage.returnMenClothingTopsAndTshirtsCategoryPage();
		logger.info("Finishing navigate Men Clothing sub-categories test.");
	}

	@Test(priority = 2)
	public void navigatemenAccessoriesCategoriesTest() {
		logger.info("Starting navigate men Accessories sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		menCategoryPage = homePage.returnMenCategoryPage();
		menCategoryPage.menCategory();
		menAccessoriesPage = menCategoryPage.returnMenAccessoriesCategoryPage();
		menCategoryPage.menCategory();
		menAccessoriesBagsPage = menAccessoriesPage.returnMenAccessoriesBagsCategoryPage();
		menCategoryPage.menCategory();
		menAccessoriesGlovesPage = menAccessoriesPage.returnMenAccessoriesGlovesCategoryPage();
		menCategoryPage.menCategory();
		menAccessoriesHeadwearPage = menAccessoriesPage.returnMenAccessoriesHeadwearCategoryPage();
		menCategoryPage.menCategory();
		menAccessoriesSocksPage = menAccessoriesPage.returnMenAccessoriesSocksCategoryPage();
		logger.info("Finishing navigate men Accessories sub-categories test.");
	}

	@Test(priority = 3)
	public void navigatemenFeaturedCategoriesTest() {
		logger.info("Starting navigate Men Featured sub-categories test...");
		homePage = new HomePage(new ChromeDriver());
		homePage.load(environment.DEVELOPMENT.getURL());
		homePage.UKlocation();
		menCategoryPage = homePage.returnMenCategoryPage();
		menCategoryPage.menCategory();
		menFeaturedPage = menCategoryPage.returnMenFeaturedCategoryPage();
		menCategoryPage.menCategory();
		menFeaturedTeamCollectionPage = menFeaturedPage.returMenFeaturedTeamCollectionCategoryPage();
		menCategoryPage.menCategory();
		menFeaturedVentTekPage = menFeaturedPage.returnMenFeaturedVentTekCategoryPage();
		logger.info("Finishing navigate Men Featured sub-categories test.");
	} 

	@AfterTest
	public void tearDown() {
		homePage.quit();
		menCategoryPage.quit();
		menFootwearPage.quit();
		menFootwearRidingPage.quit();
		menFootwearWesterenPage.quit();
		menFootwearCountryPage.quit();
		menFootwearCasualShoesPage.quit();
		menFootwearWorkPage.quit();
		
		menClothingPage.quit();
		menClothingOuterwearPage.quit();
		menClothingBreechesPage.quit();
		menClothingSweatTshirtAndWoodiesPage.quit();
		menClothingTopsAndTshirtsPage.quit();
		
		menAccessoriesPage.quit();
		menAccessoriesBagsPage.quit();
		menAccessoriesGlovesPage.quit();
		menAccessoriesHeadwearPage.quit();
		menAccessoriesSocksPage.quit();
		
		menFeaturedPage.quit();
		menFeaturedTeamCollectionPage.quit();
		menFeaturedVentTekPage.quit();
		
	}
}
