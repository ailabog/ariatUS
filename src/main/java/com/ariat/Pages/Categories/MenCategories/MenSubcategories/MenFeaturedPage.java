package com.ariat.Pages.Categories.MenCategories.MenSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFeaturedSubcategories.MenFeaturedTeamCollectionPage;
import com.ariat.Pages.Categories.MenCategories.MenSubcategories.MenFeaturedSubcategories.MenFeaturedVentTekPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedSubcategories.WomenFeaturedHeritageCollectionPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenFeaturedSubcategories.WomenFeaturedTriFactorBreechPage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Men Featured Category Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class MenFeaturedPage extends BasePage{
	
	private By menFeaturedTeamCollectionCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[9]/li/ul/li[1]/a");
	private By menFeaturedTeamCollectionText = By.xpath("//*[@id=\"main\"]/div/div[1]/aside/div[2]/span[1]");
	private By menFeaturedVentTekCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[2]/div[2]/div/div[2]/ul[9]/li/ul/li[2]/a");
	private By menFeaturedVentTekText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	

	protected MenFeaturedPage(WebDriver driver) {
		super(driver);
	}
	

	public MenFeaturedTeamCollectionPage returMenFeaturedTeamCollectionCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menFeaturedTeamCollectionCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menFeaturedTeamCollectionText));
		return new MenFeaturedTeamCollectionPage(driver);
	}
	
	public MenFeaturedVentTekPage returnMenFeaturedVentTekCategoryPage() {
		WebDriverUtils.clickOnElementWithWait(driver, menFeaturedVentTekCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(menFeaturedVentTekText));
		return new MenFeaturedVentTekPage(driver);
	}
}
