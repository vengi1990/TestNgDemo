package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
public static WebDriver driver;

@FindBy(id="radiobutton_0")
private WebElement select;
@FindBy(id="continue")
private WebElement Continue;
public Select_Hotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}

public static WebDriver getDriver() {
	return driver;
}
public WebElement getSelect() {
	return select;
}
public WebElement getContinue() {
	return Continue;
}
}
