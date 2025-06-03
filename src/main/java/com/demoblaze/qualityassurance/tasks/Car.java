package com.demoblaze.qualityassurance.tasks;

import com.demoblaze.qualityassurance.utils.ScreenshotHelper;
import com.microsoft.playwright.Page;
import com.demoblaze.qualityassurance.pages.*;

public class Car {

    static Page page;
    static HomePage homePage;
    static ProdPage prodPage;
    static CarPage carPage;


    public Car(Page page) {
        homePage = new HomePage(page);
        prodPage = new ProdPage(page);
        carPage = new CarPage(page);
    }

    public String addProduct(){
        homePage.selectItem();
        prodPage.setAddToCar();
        prodPage.clickOnButtonCar();
        return carPage.buttonDelete();
    }
}
