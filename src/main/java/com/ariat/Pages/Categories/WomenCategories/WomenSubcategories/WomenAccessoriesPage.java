package com.ariat.Pages.Categories.WomenCategories.WomenSubcategories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ariat.Pages.BasePage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesBagsPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesGlovesPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesHeadwearPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesScarfAndPonchosPage;
import com.ariat.Pages.Categories.WomenCategories.WomenSubcategories.WomenAccessoriesSubcategories.WomenAccessoriesSocksPage;
import com.ariat.Utils.WebDriverUtils;

/**
 * Implements Women Accessories Category Page
 * @author aila.bogasieru@ariat.com
 *
 */

public class WomenAccessoriesPage extends BasePage{
	
	private By womenAccessoriesHeadwearCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[3]/li/ul/li[1]/a");
	private By womenAccessoriesHeadwearText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenAccessoriesGlovesCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[3]/li/ul/li[2]/a");
	private By womenAccessoriesGlovesText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenAccessoriesBagsCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[3]/li/ul/li[3]/a");
	private By womenAccessoriesBagsText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenAccessoriesScarfAndPonchosCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[3]/li/ul/li[4]/a");
	private By womenAccessoriesScarfAndPonchosText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	private By womenAccessoriesSocksCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/div[2]/div/div[2]/ul[3]/li/ul/li[5]/a");
	private By womenAccessoriesSocksText = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[1]/span[1]");
	 private By womenCategory = By.xpath("//*[@id=\"global-nav-container\"]/li[1]/a");

	public WomenAccessoriesPage(WebDriver driver) {
		super(driver);
	}
	
	public void womenCategory() {
		WebDriverUtils.moveToElement(driver, womenCategory);
	}
	
	public WomenAccessoriesHeadwearPage returnWomenAccessoriesHeadwearPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenAccessoriesHeadwearCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesHeadwearText));
		return new WomenAccessoriesHeadwearPage(driver);
	}
	
	public WomenAccessoriesGlovesPage returnWomenAccessoriesGlovesPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenAccessoriesGlovesCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesGlovesText));
		return new WomenAccessoriesGlovesPage(driver);
	}
	
	public WomenAccessoriesBagsPage returnWomenAccessoriesBagsPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenAccessoriesBagsCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesBagsText));
		return new WomenAccessoriesBagsPage(driver);
	}
	
	public WomenAccessoriesScarfAndPonchosPage returnWomenAccessoriesScarfAndPonchosPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenAccessoriesScarfAndPonchosCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesScarfAndPonchosText));
		return new WomenAccessoriesScarfAndPonchosPage(driver);
	}
	
	public WomenAccessoriesSocksPage returnWomenAccessoriesSocksPage() {
		WebDriverUtils.clickOnElementWithWait(driver, womenAccessoriesSocksCategory);
		WebDriverUtils.waitUntil(driver, WebDriverUtils.WAIT_40_SECONDS,
				ExpectedConditions.invisibilityOfElementLocated(womenAccessoriesSocksText));
		return new WomenAccessoriesSocksPage(driver);
	}
	
}
