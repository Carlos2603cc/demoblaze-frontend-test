package com.demoblaze.qualityassurance.tasks;

import com.demoblaze.qualityassurance.pages.CarPage;
import com.demoblaze.qualityassurance.pages.HomePage;
import com.demoblaze.qualityassurance.pages.ProdPage;
import com.microsoft.playwright.Page;

public class Purchase {

    static HomePage homePage;
    static ProdPage prodPage;
    static CarPage carPage;

    public Purchase(Page page) {
        homePage = new HomePage(page);
        prodPage = new ProdPage(page);
        carPage = new CarPage(page);
    }

    public String complete(){
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
        String menssege = carPage.getSuccessfulPurchase();
        carPage.clickOnbuttonOk();
        return menssege;
    }
}
