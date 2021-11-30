package com.seleniumboilerplate.pages.home;

import com.seleniumboilerplate.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return getText(By.cssSelector(".navbar-brand"));
    }

    public Boolean titleDisplayed() {
        return isDisplayed(By.cssSelector(".navbar-brand"));
    }

}
