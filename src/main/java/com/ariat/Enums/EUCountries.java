package com.ariat.Enums;

import org.openqa.selenium.By;

/**
 * Shortcuts of countries by country code
 * @author aila.bogasieru@ariat.com
 */

public enum EUCountries {
	
	USA("English(United States)",       "USD",      "US dollar",           By.xpath("//img[contains(@src, 'US.gif')]")),
	UK("English (United Kingdom)",      "GBP",      "British pound",       By.xpath("//img[contains(@src, 'GB.gif')]")),
	BE("English (Belgium)",             "EUR",      "EURO",                By.xpath("//img[contains(@src, 'BE.gif')]")),
	AU("English (Australia)",           "AUD",      "Canadian dollar",     By.xpath("//img[contains(@src, 'AU.gif')]")),
	IE("English (Ireland)",             "EUR",      "EURO",                By.xpath("//img[contains(@src, 'IE.gif')]")),
	DK("English (Denmark)",             "EURO",     "EURO",                By.xpath("//img[contains(@src, 'DK.gif')]")),
	FR("Francais(France)",              "EUR",      "EURO",                By.xpath("//img[contains(@src, 'FR.gif')]")),
	DE("Deutsch (Deutschland)",         "EUR",      "EURO",                By.xpath("//img[contains(@src, 'DE.gif')]")), 
	NO("English (Norway)",              "EUR",      "EURO",                By.xpath("//img[contains(@src, 'NO.gif')]")), 
	FI("English (Finland)",             "EUR",      "EURO",                By.xpath("//img[contains(@src, 'FI.gif')]")),
	SW("Deutsch (Schweiz)",             "EUR",      "EURO",                By.xpath("//img[contains(@src, 'CH.gif')]")),
	NL("English (Netherlands)",         "EUR",      "EURO",                By.xpath("//img[contains(@src, 'NL.gif')]")),
	LU("English (Luxembourg)",          "EUR",      "EURO",                By.xpath("//img[contains(@src, 'LU.gif')]")),
	IT("English (Italy)",               "EUR",      "EURO",                By.xpath("//img[contains(@src, 'IT.gif')]")),
	SE("English (Sweden)",              "EUR",      "EURO",                By.xpath("//img[contains(@src, 'SE.gif')]")),
	NZ("English (New Zealand)",         "NZD",      "New Zealand dollar",  By.xpath("//img[contains(@src, 'NZ.gif')]"));
	
	
	private String languageCountryName;
	private String currencyISO;
	private String currencyFullName;
	private By locator;
	
	private EUCountries(String languageCountryName, String currencyISO, String currencyFullName, By locator) {
		this.languageCountryName = languageCountryName;
		this.currencyISO = currencyISO;
		this.currencyFullName = currencyFullName;
		this.locator = locator;
	}
	
	public String getLanguageCountryName() {
		return languageCountryName;
	}
	
	public String getCurrencyISO() {
		return currencyISO;
	}
	
	public String getCurrencyFullName() {
		return currencyFullName;
	}

	public By getLocator() {
		return locator;
	}
}
