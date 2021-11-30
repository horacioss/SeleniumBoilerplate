package com.seleniumboilerplate;

import com.seleniumboilerplate.pages.home.HomePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class HomePageTest extends BaseTest{

    private HomePage homePage;

    @Test
    public void testTitle() {
        homePage = new HomePage(getDriver());
        String titlePage = homePage.getTitle();
        assertEquals("PRODUCT STORE", titlePage);
        assertTrue(homePage.titleDisplayed());
    }

}
