package com.demoblaze.qualityassurance.tests;

import com.demoblaze.qualityassurance.factory.PlaywrightFactory;
import com.demoblaze.qualityassurance.pages.HomePage;
import com.demoblaze.qualityassurance.pages.ProdPage;
import com.demoblaze.qualityassurance.pages.CarPage;
import com.microsoft.playwright.Page;
import org.junit.jupiter.api.*;

public class AddToCarTest {
    static PlaywrightFactory pf;
    static Page page;
    static HomePage homePage;
    static ProdPage prodPage;
    static CarPage carPage;


    @BeforeEach
    public void setup() {
        pf = new PlaywrightFactory();
        page = pf.initBrowser("chromium");
        homePage = new HomePage(page);
        prodPage = new ProdPage(page);
        carPage = new CarPage(page);

    }

    @Test
    public void addProductToCar() {
        homePage.selectItem();
        prodPage.setAddToCar();
        prodPage.clickOnButtonCar();
        Assertions.assertEquals(carPage.buttonDelete(), "Delete");
    }

    @Test
    public void completePurchase() {
        homePage.selectItem();
        prodPage.setAddToCar();
        prodPage.clickOnButtonCar();
        carPage.clickOnbuttonPlaceOrder();
        carPage.enterName("carlos");
        carPage.enterContry("Argentina");
        carPage.enterCity("buenos Aires");
        carPage.enterCreditCard("37653865386538");
        carPage.enterMonth("mayo");
        carPage.enterYear("2030");
        carPage.clickOnbuttonPurchase();
        Assertions.assertEquals(carPage.getSuccessfulPurchase(),"Thank you for your purchase!");
        carPage.clickOnbuttonOk();
    }

    @Test
    public void signUp_logIn() {
        String numero = String.valueOf((int)(Math.random() * 1000));
        homePage.signUp();
        homePage.setSignUpUserName("carlos"+ numero);
        homePage.setSignUpPass(numero);
        homePage.signUpButton();
        homePage.login();
        homePage.setLoginUserName("carlos"+ numero);
        homePage.setLoginPass(numero);
        homePage.loginButton();
        Assertions.assertTrue(homePage.getWelcome().isVisible());


    }



    @AfterEach
    public void tearDown() {
        page.context().browser().close();
    }

}
