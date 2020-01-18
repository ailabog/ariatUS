package com.ariat.Enums;

import org.openqa.selenium.By;

/**
 * Shortcuts of countries by country code
 * @author aila.bogasieru@ariat.com
 */

public enum States {
	
	ALASKA("Alaska", By.xpath("//span[text()='Alaska']")),
	ARIZONA("Arizona", By.xpath("//span[text()='Arizona']")),
	HAWAII("Hawaii",  By.xpath("//span[text()='Hawaii']")),
	KENTUCKY("Kentucky", By.xpath("//span[text()='Kentucky']")),
	CALIFORNIA("California", By.xpath("//span[text()='California']")),
	NEWYORK("New York", By.xpath("//span[text()='New York']")),
	TEXAS("Texas", By.xpath("//span[text()='Texas']"));
	
	
	private String name;
	private By locator;
	
	private States(String name, By locator) {
		this.name = name;
		this.locator = locator;
	}

	public By getLocator() {
		return locator;
	}
	
	public String getName() {
		return name;
	}
	
}
